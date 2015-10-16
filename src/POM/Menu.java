package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu 
{
	@FindBy(linkText="SIGN-ON")
	WebElement SIGNON;
	public void SIGNON()
	{
		SIGNON.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement REGISTER;
	public void REGISTER()
	{
		REGISTER.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement SUPPORT;
	public void SUPPORT()
	{
		SUPPORT.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement CONTACT;
	public void CONTACT()
	{
		CONTACT.click();
	}
	
}

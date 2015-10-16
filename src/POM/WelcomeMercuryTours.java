package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeMercuryTours 
{
	public Menu menu=null;
	public WelcomeMercuryTours(WebDriver driver)
	{
		menu=PageFactory.initElements(driver,Menu.class);
	}
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	
	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement userName1;
	
	@FindBy(name="address1")
	WebElement address1;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password1;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name="register")
	WebElement register;
	
	
	public void findAflight(String u,String p)
	{
		userName.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}
	
	
	@FindBy(name="your destination")
	WebElement destination;
	public void destination()
	{
		destination.click();
	}
	
	
	@FindBy(name="featured vacation destinations")
	WebElement vacation;
	public void vacation()
	{
		vacation.click();
	}
	
	//@FindBy(name="Register here")
	//WebElement register;
	public void register( String f,String l,String p,String e,String a,String c,String s,String po,String co,String u1,String p1,String cp)
	{
		firstName.sendKeys(f);
		lastName.sendKeys(l);
		phone.sendKeys(p);
		userName1.sendKeys(e);
		address1.sendKeys(a);
		city.sendKeys(c);
		state.sendKeys(s);
		postalCode.sendKeys(po);
		country.sendKeys(co);
		email.sendKeys(u1);
		password1.sendKeys(p1);
		confirmPassword.sendKeys(cp);
		register.click();
	}
}

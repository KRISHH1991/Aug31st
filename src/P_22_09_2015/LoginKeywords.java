package P_22_09_2015;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginKeywords 
{
	FirefoxDriver driver;
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://gmail.com");
	}
	public void enterUsername()
	{
		driver.findElement(By.id("Email")).sendKeys("kjamadar26@gmail.com");
	}
	public void clickNext() throws InterruptedException
	{
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
	}
	public void enterPassword()
	{
		driver.findElement(By.id("Passwd")).sendKeys("reachable");
	}
	public void clickLogin()
	{
		driver.findElement(By.id("signIn")).click();
	}

}

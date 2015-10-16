package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoologin 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.findElement(By.id("login-username")).sendKeys("");
		driver.findElement(By.id("login-passwd")).sendKeys("");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-signin")).click();
	}

}

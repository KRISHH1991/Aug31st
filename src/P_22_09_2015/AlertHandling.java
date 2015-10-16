package P_22_09_2015;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}
	@Test
	public void alerthandling() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Friends');");
		Thread.sleep(5000);
		alertHandle();
	}
	public void alertHandle()
	{
		try
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e)
		{
			
		}
	}
}

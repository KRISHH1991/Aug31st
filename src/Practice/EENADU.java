package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EENADU 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.eenadu.net/hyderabad-news-inner.aspx?item=break183");
	}
	@Test
	public void linkclick() 
	{
		driver.findElement(By.xpath("//a[@href='hyderabad-news-inner.aspx?item=break229']")).click();

	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

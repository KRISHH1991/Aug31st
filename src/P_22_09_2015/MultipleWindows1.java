package P_22_09_2015;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows1 
{
	FirefoxDriver driver;
	@BeforeMethod()
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://bing.com");
	}
	@Test
	public void multiplewindowtest()
	{
		driver.findElement(By.linkText("Help")).click();
		switchwindow("//*[@id='privacyLabel']");
		switchwindow("//*[@id='psp_microsoft_services_agreement']");
	}
	public void switchwindow(String x)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath(x)).click();
			break;
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

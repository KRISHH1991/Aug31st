package P_22_09_2015;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTesting
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	@Test
	public void frametest()
	{
		List<WebElement> List=driver.findElements(By.tagName("frame"));
		System.out.println(List.size());
		for(int i=0;i<List.size();i++)
		{
			driver.switchTo().frame(i);
			try
			{
				driver.findElement(By.xpath("html/body/p[3]/font/b")).click();
			break;
			}
			catch(Exception e)
			{
				driver.switchTo().defaultContent();
			}
		}
	}
}

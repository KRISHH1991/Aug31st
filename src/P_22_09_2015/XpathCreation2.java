package P_22_09_2015;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathCreation2 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://timesofindia.indiatimes.com/");
		
	}
	
	@Test
	public void xpathTest()
	{
		List<WebElement> links=driver.findElements(By.xpath("//div[@class='top-story']/ul[@class='list8']/li[@class='']"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
	}
}

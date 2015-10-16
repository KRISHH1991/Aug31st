package P_22_09_2015;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathFacebook 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void inputTest()
	{
		String str[]={"one","two","three","four","five","six","seven"};
		List<WebElement> inputs=driver.findElements(By.xpath("//input[@type='text' or @type='password' or @type='email']"));
	System.out.println(inputs.size());
	for(int i=0;i<inputs.size();i++)
	{
		inputs.get(i).sendKeys(str[i]);
	}
	
	}
}

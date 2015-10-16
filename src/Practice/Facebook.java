package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
	}
	@Test
	public void inputfields()
	{
		String[] str={"one","two","three","four","five","six","seven"};
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='email' or @type='password' or @type='text']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			list.get(i).sendKeys(str[i]);
		}
	}
}

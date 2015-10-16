package P_22_09_2015;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkboxtesting 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
	}
	@Test
	public void checkboxtest()
	{
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox'] "));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getText()+"---"+check.get(i).getAttribute("checked"));
		}
	}
}

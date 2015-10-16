package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
	}
	
	@Test
	public void radiobuttontest()
	{
		WebElement radio=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		List<WebElement> list=radio.findElements(By.name("group1"));
		for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
			for(int j=0;j<list.size();j++)
			{
			System.out.println(list.get(j).getText()+"-----"+list.get(j).getAttribute("checked"));
			
			}
			System.out.println("#####################################");
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

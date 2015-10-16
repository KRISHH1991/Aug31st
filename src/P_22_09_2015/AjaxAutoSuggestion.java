package P_22_09_2015;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxAutoSuggestion 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}
	@Test
	public void ajaxtest() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(1000);
		
		WebElement block=driver.findElement(By.className("sbib_b"));
		List<WebElement> ajax=block.findElements(By.xpath("//*[starts-with(@id,'sbse')]/div[2]"));
	System.out.println(ajax.size());
	for(int i=0;i<ajax.size();i++)
	{
		System.out.println(ajax.get(i).getText());
	}
	}
}

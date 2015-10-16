package P_22_09_2015;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dynamicxpath 
{
	
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/?p=us");		
	}
	@Test
	public void dynamicxpath()
	{
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_144307')]/div/ol/li[6]/a")).click();
		
	}
}

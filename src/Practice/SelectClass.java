package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClass 
{
	FirefoxDriver driver;
	@BeforeMethod()
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("htp://amazon.in");
	}
	@Test
	public void dropdowntest() throws InterruptedException
	{
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		Select sel=new Select(drop);
	sel.deselectByVisibleText("Baby");
		Thread.sleep(4000);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

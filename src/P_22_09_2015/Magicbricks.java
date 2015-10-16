package P_22_09_2015;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Magicbricks 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.magicbricks.com/");
	}
	
	@Test
	public void search()
	{
		driver.findElement(By.id("keyword")).sendKeys("Mumbai");
		driver.findElement(By.id("buy_propertyType")).click();
		driver.findElement(By.id("propType_buy_chk_10002_10003_10021_10022")).click();
		driver.findElement(By.id("bhk_11700")).click();
		driver.findElement(By.id("buy_budget_lbl")).click();
		driver.findElement(By.id("budget_buy_min")).click();
		driver.findElement(By.id("btnPropertySearch")).click();
	}
}

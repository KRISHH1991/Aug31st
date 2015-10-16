package P_22_09_2015;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multidropdownselection 
{
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	driver=new FirefoxDriver();
	driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	
}
@Test
public void multidroptest()
{
	driver.switchTo().frame("iframeResult");
	WebElement drop=driver.findElement(By.name("cars"));
	Select sel=new Select(drop);
	sel.selectByVisibleText("Volvo");
	sel.selectByVisibleText("Saab");
	driver.findElement(By.xpath("html/body/form/input")).click();
}

}

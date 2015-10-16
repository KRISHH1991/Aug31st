package P_22_09_2015;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginusinglog4j 
{
	private static Logger log=Logger.getLogger(Loginusinglog4j.class);
	public static void main(String[] args) 
	{
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser Launched");
		
		driver.get("http://yahoomail.com");
		log.info("Opened yahoo");
		
		driver.findElement(By.name("username")).sendKeys("saikrishna");
		log.info("Entered USername");
		
		driver.findElement(By.id("login-passwd")).sendKeys("pass@123");
		log.info("entered password");
		
		driver.findElement(By.id("login-signin")).click();
		log.info("clicked on login");
	}

}

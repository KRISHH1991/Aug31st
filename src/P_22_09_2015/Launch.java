package P_22_09_2015;

import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;

public class Launch 
{
		FirefoxDriver driver;
		@BeforeClass
		public void launchApp()
		{
			
			driver=new FirefoxDriver();
			driver.get("http://newtours.demaout.com");
			
		}
		
		@AfterClass
		public void closeApp()
		{
			driver.quit();
		}
		
	}


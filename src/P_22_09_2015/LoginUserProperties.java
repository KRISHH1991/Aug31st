package P_22_09_2015;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUserProperties {
		FirefoxDriver driver;
		@BeforeMethod
		public void setUp()
		{
			driver=new FirefoxDriver();
			driver.get("http://gmail.com");
		}
		
		@Test
		public void loginTest() throws IOException, InterruptedException
		{
			FileInputStream f=new FileInputStream("E:\\aug31\\TestNG\\Login.properties");
			Properties pr=new Properties();
			pr.load(f);
			
			driver.findElement(By.id(pr.getProperty("txt_username"))).sendKeys("kjamadar26@gmail.com");
			driver.findElement(By.id(pr.getProperty("btn_next"))).click();
			Thread.sleep(500);
			driver.findElement(By.id(pr.getProperty("txt_password"))).sendKeys("reachable");
			driver.findElement(By.id(pr.getProperty("btn_signin"))).click();
			
			
			
			
			
			
		}

	}



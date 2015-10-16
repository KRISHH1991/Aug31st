
package P_22_09_2015;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Yahoologin 
{
	@Test
	public void loginTest() throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://yahoomail.com");
		driver.findElement(By.name("username")).sendKeys("jamadarkrishna@yahoo.com");
		driver.findElement(By.id("login-passwd")).sendKeys("12345");
		driver.findElement(By.id("login-signin")).click();
	
	}
	
}

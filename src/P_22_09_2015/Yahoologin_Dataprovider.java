package P_22_09_2015;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Yahoologin_Dataprovider 
{
	@DataProvider(parallel=true)
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="Krishna";
		data[0][1]="pass@123";
		data[0][2]="firefox";
		
		data[1][0]="Krishna";
		data[1][1]="pass@123";
		data[1][2]="chrome";
		return data;
		
	}
	
	@Test(dataProvider="getdata")
	public void loginTest(String u,String p,String b) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.name("username")).sendKeys(u);
		driver.findElement(By.id("login-passwd")).sendKeys(p);
		driver.findElement(By.id("login-signin")).click();
	}
}

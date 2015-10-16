package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class TryCatch 
{

	public static void main(String[] args) throws IOException 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		try
		{
			driver.findElement(By.linkText("Rajnikant")).click();
		}
		catch(Exception e)
		{
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile,new File("C:\\Users\\hp pc\\Desktop\\rajnikant.jpeg"));
		}
		driver.quit();

	}

}

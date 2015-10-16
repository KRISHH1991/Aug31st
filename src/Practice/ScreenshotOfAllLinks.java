package Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ScreenshotOfAllLinks {

	public static void main(String[] args) throws IOException 
	{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("Myprofile");
	
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://newtours.demoaut.com");
	
	List<WebElement> link=driver.findElements(By.tagName("a"));
	for(int i=0;i<link.size();i++)
	{
		String name=link.get(i).getText();
		link.get(i).click();
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\hp pc\\Desktop\\Linkimage"+name+".jpeg"));
		driver.navigate().back();
		link=driver.findElements(By.tagName("a"));

	}
	driver.quit();
	}

}

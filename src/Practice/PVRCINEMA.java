package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class PVRCINEMA 
{

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.pvrcinemas.com/");
		
		WebElement block=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]"));
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			links.get(i).getText();
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			block=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]"));
			links=driver.findElements(By.tagName("a"));
		}
		driver.quit();

	}

}

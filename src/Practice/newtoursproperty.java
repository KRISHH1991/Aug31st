package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class newtoursproperty 
{

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
			System.out.println(links.get(i).getText());
			String l=links.get(i).getAttribute("href");
			links.get(i).click();
			String m=driver.getCurrentUrl();
			if(m.contains(l))
			{
				System.out.println("Links are working fine");
			}
			else
			{
				System.out.println("links are not working correctly");
			}
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
		}
		

	}
		driver.quit();
}
}
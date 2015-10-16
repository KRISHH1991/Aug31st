package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Captureallelementindropdown 
{

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://amazon.in");
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> list=drop.findElements(By.tagName("option"));
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
			System.out.println(list.get(i).getText());
		}

	}

}

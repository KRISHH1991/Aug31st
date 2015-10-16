package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class bingdotcom 
{
	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
		String acturl = driver.findElement(By.linkText("VIDEOS")).getAttribute("href");
		driver.findElement(By.linkText("VIDEOS")).click();
	String ecpturl=driver.getCurrentUrl();
	if(acturl.equals(ecpturl))
	{
		System.out.println("Videos Link is working fine ");
	}
	else
	{
		System.out.println("Videos links is not working fine");
	}

	}

}

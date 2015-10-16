package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CaptchaAutomation 
{

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.harvard.edu/feedback");
		
		driver.findElement(By.id("edit-submitted-name")).sendKeys("Test");
		driver.findElement(By.id("edit-submitted-email")).sendKeys("Test@nigarfalls.com");
		driver.findElement(By.id("edit-submitted-comment")).sendKeys("Captcha is of no use");
		
		String x=driver.findElement(By.className("field-prefix")).getText();
		String[] a=x.split(" ");
		int i=Integer.parseInt(a[0]);
		int j=Integer.parseInt(a[2]);
		int k=i+j;
		
		String str=Integer.toString(k);
		
		driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
		driver.findElement(By.name("op")).click();

	}

}

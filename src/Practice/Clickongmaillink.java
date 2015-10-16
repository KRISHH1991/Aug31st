package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clickongmaillink 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		String exptlinkname="Gmail";
		String actlinkname=driver.getTitle();
		if(exptlinkname.equals(actlinkname))
		{
			System.out.println("Gmail link is working fine");
		}
		else
		{
			System.out.println("Gmail link is not working fine");
		}

	}

}

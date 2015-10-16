package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SanityTesting {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.goair.in/");
		
		WebElement frm=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> frmlist=frm.findElements(By.tagName("option"));
		
		int b=myRandomNo(frmlist.size()-1);
		frmlist.get(b).click();
		
		String city=frmlist.get(b).getText();
		
		WebElement todrop=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
		if(todrop.getText().contains(city))
		{
			System.out.println(city+" not working correctly");
		}
		else
		{
			System.out.println(city+" working correctly" );
		}
		driver.quit();
	}
	
	public static int myRandomNo(int x)
	{
		double d=Math.random()*x;
		int a=(int)d;
		return a;
	}	

	}



package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class TocheckbothdropdowninGoAirDotIN 
{

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.goair.in/");
		
		WebElement from=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> frmlist=from.findElements(By.tagName("option"));
		System.out.println("Dropdown items count :"+frmlist.size());
		
		for(int i=0;i<frmlist.size();i++)
		{
			frmlist.get(i).click();
			String frmdrop=frmlist.get(i).getText();
			
			List<WebElement> tolist=driver.findElements(By.id("toCitysearchBoxUserControlCriteriaBox"));
			if(tolist.get(i).getText().contains(frmdrop))
			{
				System.out.println("To Dropdown is not working correctly");
			}
			else
			{
				System.out.println("Both Dropdown are working correctly");
			}
		}
		driver.quit();
	}

}

package POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase 
{
	@Test
	public void PomTestCase()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.newtours.demoaut.com");
		
		WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		//wm.findAflight("Krishna","pass@123");
wm.menu.REGISTER();
wm.register("Krishna", "Jamadar","1234567890","kjamadar@gmail.com", "Worli","Mumbai","Maharashtra","400018","India","Krishna","krish@123","krish@123");		

	}
}

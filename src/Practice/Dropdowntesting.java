package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Dropdowntesting {

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Myprofile");
		
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://amazon.in");
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mi4i");
		driver.findElement(By.className("nav-input")).click();
		

	}

}

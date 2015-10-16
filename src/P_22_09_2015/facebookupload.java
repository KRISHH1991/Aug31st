package P_22_09_2015;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookupload {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("jamadarkrishna@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("vkvkvkvkvk");
		driver.findElement(By.id("u_0_v")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("u_0_t")).click();
		

	}

}

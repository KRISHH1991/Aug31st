package P_22_09_2015;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadAutoit {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com/");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.id("SWFUpload_0")).click();
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\hp pc\\Desktop\\AUTOIT\\upload.exe");
		Thread.sleep(5000);
		driver.findElement(By.id("upload-global-start-button")).click();

	}

}

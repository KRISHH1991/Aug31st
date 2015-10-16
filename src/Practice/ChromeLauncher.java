package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLauncher {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://google.com");

	}

}

package Practice;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;



public class HTMLUNITDRIVER {

	public static void main(String[] args) 
	{
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://google.com");
		System.out.println("Htmlunit driver working is fine");

	}

}

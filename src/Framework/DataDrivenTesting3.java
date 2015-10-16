package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenTesting3 
{
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill");
	}
	@Test
	public void ajaxtest() throws IOException 
	{
		FileInputStream f=new FileInputStream("E:\\aug31\\TestNG\\src\\com\\qedge\\excelfiles\\Ajaxdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String c=r.getCell(0).getStringCellValue();
			driver.findElement(By.name("mobileNumber")).clear();
			driver.findElement(By.name("mobileNumber")).sendKeys(c);
			driver.findElement(By.name("amountPaid")).click();
			WebElement ajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label"));
			String actajax=null;
			if(ajax.getText().isEmpty())
			{
				actajax="No Ajax";
			}
			else
			{
				actajax=ajax.getText();
			}
			r.createCell(2).setCellValue(actajax);
			String expajax=r.getCell(1).getStringCellValue();
			if(actajax.equals(expajax))
			{
				r.createCell(3).setCellValue("Passed");
			}
			else
			{
				r.createCell(3).setCellValue("Failed");
			}
			FileOutputStream f1=new FileOutputStream("E:\\aug31\\TestNG\\src\\com\\qedge\\resultexcelfiles\\ajaxdata.xlsx");
			wb.write(f1);
			f1.close();
			
		}
		
	
	}
}

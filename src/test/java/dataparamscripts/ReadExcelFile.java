package dataparamscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcelFile {
	public WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions

		WebDriverManager.chromedriver().setup();	  
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://ui.cogmento.com/");
	    Thread.sleep(4000l);
	}
	@Test
	public void login()  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//i[@class='user icon']/following-sibling::input[1]")).sendKeys((readData("username")));
		driver.findElement(By.name("password")).sendKeys((readData("password")));
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid')]")).click();		
		
	    
	}
	
	public String readData(String colName) throws IOException {
		String colvalue="";
		String path=System.getProperty("user.dir")+"//src//test//resources//logindata.xlsx";
		FileInputStream fin=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet loginsheet=workbook.getSheet("sheet1");
		int numRows=loginsheet.getLastRowNum();
		for(int i=1;i<numRows;i++) {
			XSSFRow row=loginsheet.getRow(i);
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(colName)) {
				colvalue=row.getCell(1).getStringCellValue();
			}
		}
		return colvalue;
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}

package stepdefs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearch {

	public WebDriver driver;

	@Given("I launch google page")
	public void i_launch_google_page() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();	  
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.in/");
	    
	}

	@When("i search java tutorial")
	public void i_search_java_tutorial()  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("f")).sendKeys("java tutorial");
		driver.findElement(By.name("q")).submit();
		
	    
	}
	/*@Then("should display java result page")
	public void should_display_java_result_page()  throws Throwable{
	    String actual=driver.getTitle();
	    Assert.assertEquals("google23", actual);
	    
	}*/
	@When("i search selenium tutorial")
	public void i_search_selenium_tutorial()  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("selenium tutorial");
		driver.findElement(By.name("q")).submit();
		
	    
	}

	
	@After
	public void teardown(Scenario scenario) throws IOException {
	if(scenario.isFailed()) {
		TakesScreenshot screen=(TakesScreenshot)driver;
		File screenshot=screen.getScreenshotAs(OutputType.FILE);
		byte[] filecontent=FileUtils.readFileToByteArray(screenshot);
		scenario.attach(filecontent, "image/png", "image1");
		
	}
	}
	@Given("User is on CRM login page")
	public void crm_login1_page() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();	  
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://ui.cogmento.com/");
	    Thread.sleep(4000l);
	    
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_credentials(String username, String password)  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//i[@class='user icon']/following-sibling::input[1]")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid')]")).click();
		
	    
	}

	@When("User enters Credentials")
	public void Enter_Credentials_by_datatable(DataTable usercrd)  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		List<List<String>> data=usercrd.asLists();
		driver.findElement(By.xpath("//i[@class='user icon']/following-sibling::input[1]")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid')]")).click();
		
	    
	}
	@When("User enters Credentials for hashmap")
	public void Enter_Credentials_by_db_hashmap(DataTable usercrd)  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		List<Map<String, String>> data=usercrd.asMaps();
		driver.findElement(By.xpath("//i[@class='user icon']/following-sibling::input[1]")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid')]")).click();
		
	    
	}
	@Then("Close the Browser")
	public void close_the_browser()  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
		  
	}
	}





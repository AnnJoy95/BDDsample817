package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CRMcontact {

	public WebDriver driver;
	@Before(order=1)
	public void read_property() {
		System.out.println("Read Property");
	}
	@Given("User must be logged in")
	public void user_login() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User logged in");
	}
	@When("Contact is created")
	public void contact_create() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Contact Created");
	}

	@And("Contact must be available")
	public void contact_available() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Contact available");
	}
	
	@When("Contact is updated")
   public void contact_updated() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Contact is updated");
	}
	@When("user view the contact details")
	 public void contact_view() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Contact is viewed");
	}

	@When("user delete contact")
	 public void contact_deleted() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Contact is deleted");
	}

	@When("User logout app")
	 public void user_logout() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user logged out");
	}


@After()
public void teardown() {
	System.out.println("after test");
}
}


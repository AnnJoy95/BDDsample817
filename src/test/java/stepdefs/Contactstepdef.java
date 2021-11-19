package stepdefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Contactstepdef extends TestBase{
  LoginPage loginpage;
	@Given("CRM User is on login page")
	public void crm_user_login() throws Throwable{
	initialize();
	}
	@When("User enters login credentials")
	public void Enter_Credentials(DataTable usercrd)  throws Throwable{
	   loginpage =new LoginPage();
	   List<Map<String, String>> data=usercrd.asMaps();
	   String strUser=data.get(0).get("username");
	   String strPwd=data.get(0).get("password");
	   loginpage.login(strUser, strPwd);
	}
	@Then("Navigate to contact page")
	public void Enter_Login_page()  throws Throwable{
	   
	}
	@And("user click to contact page")
	public void close_the_browser()  throws Throwable{
	   
		  
	}
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
  @FindBy(name="email")
  //driver.findElement(By.name("email")).sendKeys("values to send");
  WebElement username;
  
  @FindBy(name="password")
  WebElement pwd;
  
  
  @FindBy(xpath="//div[text()='Login']")
 WebElement Loginbtn;
  
  @FindBy(xpath="//div[text()='Forgot Your password?]")
 WebElement forgotpwd;
  
  public LoginPage() {
	  PageFactory.initElements(driver, this);
  }
  
  public void login(String strUser, String strPwd) {
	  username.sendKeys(strUser);
	  pwd.sendKeys(strPwd);
	  Loginbtn.click();
  }
  
}

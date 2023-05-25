package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagefactoryloginPages 
{
  WebDriver driver;
  @FindBy( id= "name")
  WebElement txt_username;
  
  @FindBy(id="password")
  WebElement txt_password;
  
  @FindBy(id="login")
  WebElement btn_login;
  
  @FindBy(id="logout")
  WebElement btn_logout;
  
  public PagefactoryloginPages(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void enterusername(String username)
  {
	  txt_username.sendKeys(username);
  }
  public void enterpassword(String password)
  {
	  txt_password.sendKeys(password);
  }
  public void clickonlogin() 
  {
	  btn_login.click();
  }
  public void verifylogoutoption()
  {
	  btn_logout.isDisplayed();
  }

}

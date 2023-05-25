

// Login page Page factory
package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF 
{
	WebDriver driver;
	@FindBy(id = "user-name")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "login-button")
	WebElement btn_login;
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, LoginPage_PF.class);
	}
	
	public void enterusername(String user)
	{
		txt_username.sendKeys(user);
	}
     public void enterpassword(String pass)
     {
    	 txt_password.sendKeys(pass);
     }
     public void clicklogin()
     {
    	 btn_login.click();
     }
}

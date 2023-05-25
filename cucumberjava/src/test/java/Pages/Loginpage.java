
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage 
{
	 WebDriver driver;
	 
 By txt_username=By.id("name");
 By txt_password=By.id("password");
 By btn_login=By.id("login");
 By btn_logout=By.id("logout");
 public Loginpage(WebDriver driver) 
 {
	 this.driver=driver;
 }

 public void enterusername(String username)
 {
	driver.findElement(txt_username).sendKeys(username);
 }
 public void enterpassword(String password)
 {
	driver.findElement(txt_password).sendKeys(password);
 }
 public void clickonlogin()
 {
	driver.findElement(btn_login).click();
 }
 public void clickonlogout()
 {
	 driver.findElement(btn_logout).isDisplayed();
 }
}


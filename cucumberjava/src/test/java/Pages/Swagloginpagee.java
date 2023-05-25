package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Swagloginpagee 
{
	WebDriver driver;
	By txt_user=By.id("user-name");
	By txt_pass=By.id("password");
	By btn_login=By.id("login-button");
	By txt_product=By.xpath("//div[text()='Sauce Labs Backpack']");
	public Swagloginpagee(WebDriver driver)
	{
	  this.driver=driver;
	}
	public void enteruser(String user)
	{
		 driver.findElement(txt_user).sendKeys(user);
	}
	public void enterpassword(String pass)
	{
		driver.findElement(txt_pass).sendKeys(pass);
	}
	public void clickonlogin()
	{
		driver.findElement(btn_login).click();
	}
	public void prodcutelement()
	{
		driver.findElement(txt_product).isDisplayed();
	}
	

}

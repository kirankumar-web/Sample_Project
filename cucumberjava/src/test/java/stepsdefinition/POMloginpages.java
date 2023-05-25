package stepsdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.Swagloginpagee;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMloginpages 
{  
	
	/*WebDriver driver=null;
	Swagloginpagee swag;
	@Given("lauch the browser")
	public void lauch_the_browser()
	{   ChromeOptions co=new ChromeOptions();
	    co.addArguments("---remote-allow-origins=*");
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver");
		driver=new ChromeDriver(co);
		swag=new Swagloginpagee(driver);
	    }

	@And("enter swag application url")
	public void enter_swag_application_url() 
	  {
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   }

	@When("^enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String user,String Pass) 
	{
		swag.enteruser(user);
		swag.enterpassword(Pass);
	   }

	@And("press login button")
	public void press_login_button() 
	{
		swag.clickonlogin();
	    }

	@Then("navigate to user account page")
	public void navigate_to_user_account_page() 
	{
		swag.prodcutelement();
	    }*/

}

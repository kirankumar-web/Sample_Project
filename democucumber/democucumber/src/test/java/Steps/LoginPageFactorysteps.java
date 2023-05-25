package Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.PagefactoryloginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageFactorysteps
{   WebDriver driver;
     PagefactoryloginPages pfpage;
	@Given("launch the browser")
	public void launch_the_browser() 
	{
		//System.setProperty("webdriver.gecko.driver","/Users/kirankumaryadav/eclipse/selenium/democucumber/democucumber/src/test/resources/drivers/geckodriver");
		//driver=new FirefoxDriver();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("---remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","/Users/kirankumaryadav/eclipse/selenium/democucumber/democucumber/src/test/resources/drivers/chromedriver");
		driver=new ChromeDriver(co);
		pfpage= new PagefactoryloginPages(driver);	

	}

	@And("Navigate to login page")
	public void navigate_to_login_page() 
	{
		driver.navigate().to("https://example.testproject.io/web/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   }

	@When("^enter the valid (.*) and (.*)$")
	public void enter_the_valid_username_and_password(String username,String password)
	{ 
		pfpage.enterusername(username);
		pfpage.enterpassword(password);
	    }

	@And("click on login button")
	public void click_on_login_button() 
	{
		pfpage.clickonlogin();
	    }

	@Then("Navigate to user homepage")
	public void navigate_to_user_homepage()
	{
		pfpage.verifylogoutoption();
		
		driver.close();
		
	    }
}

package StepsforBackground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundsampleSteps 
{
//	WebDriver driver=null;
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() 
//	{
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("---remote-allow-origins=*");
//		System.setProperty("webdriver.chrome.driver","/Users/kirankumaryadav/eclipse/selenium/cucumberjava/src/test/resources/Drivers/chromedriver");
//		driver=new ChromeDriver(co);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().window().maximize();
//		
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		}
     @Given("user is on login page")
     
    	 public void user_is_on_login_page() {
    	 
    	 
     }
	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() 
	{
	}

	@Then("User navigated to homepage")
	public void user_navigated_to_homepage() 
	{
	}
	

	@When("user is on welcome link")
	public void user_is_on_welcome_link() 
	{
	}

	@Then("logout link is displayed")
	public void logout_link_is_displayed()
	{
	}

	@Given("User is logged in")
	public void user_is_logged_in() {
	}

	@When("User clickon dasboard link")
	public void user_clickon_dasboard_link() {
	}

	@Then("Quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
	}

}

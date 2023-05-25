package StepsforHooks;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookstepsforLogin 
{
	WebDriver driver=null;
	
	@BeforeMethod
	public void browsersetup()
	{
		System.out.println("---before setup---");
		System.setProperty("webdriver.gecko.driver","/Users/kirankumaryadav/eclipse/selenium/cucumberjava/src/test/resources/Drivers/geckodriver");
		 driver=new  FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.manage().window().maximize();
	}
	@AfterMethod
	public void teardown()
	{
		System.out.println("---After Setup---");
		
		driver.close();
	}
	@BeforeStep
	public void Beforestep()
	{
		System.out.println("---Before step execution");
	}
	@AfterStep
	public void Afterstep()
	{
		System.out.println("---After step execution");

	}
	@Given("user is login page")
	public void user_is_login_page()
	{
		driver.navigate().to("https://www.facebook.com/login/");
	}
	@When("user enter valid login credentials")
	public void user_enter_valid_login_credentials() 
	{
		driver.findElement(By.id("email")).sendKeys("7981297987");
		
		driver.findElement(By.id("pass")).sendKeys("Kiran.kumar@1505");
	}
	@And("clicks on login")
	public void clicks_on_login()
	{
		driver.findElement(By.id("loginbutton")).click();
	}
	@Then("user is on homepage")
	public void user_is_on_homepage() 
	{
		driver.findElement(By.xpath("//span[text()='Kirankumar Yadav']")).isDisplayed();
	}
}

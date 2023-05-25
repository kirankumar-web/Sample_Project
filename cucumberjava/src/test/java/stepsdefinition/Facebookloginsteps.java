package stepsdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebookloginsteps 
{
	WebDriver d1=null;
	@Given("open the browser")
	public void open_the_browser() 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "/Users/kirankumaryadav/eclipse/selenium/cucumberjava/src/test/resources/Drivers/chromedriver");
	     d1=new ChromeDriver(co);
	    d1.get("https://www.google.com/");
	    
	}

	@And("navigate to login page")
	public void navigate_to_login_page()
	{
		d1.navigate().to("https://www.facebook.com/");
	    }

	@When("user enter username and password")
	public void user_enter_username_and_password() 
	{
		d1.findElement(By.id("email")).sendKeys("7981297987");
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		d1.findElement(By.name("pass")).sendKeys("Kiran.kumar@1505");
	   }

	@And("clickon login button")
	public void clickon_login_button() 
	{
		d1.findElement(By.name("login")).click();
	    }

	@Then("user acess to his account")
	public void user_acess_to_his_account() 
	{
		d1.getPageSource().contains("Kirankumar Yadav");
		 d1.close();
		
	   }
}

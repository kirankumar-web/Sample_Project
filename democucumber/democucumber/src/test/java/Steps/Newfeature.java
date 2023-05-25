package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Newfeature 
{   WebDriver driver= null;
	@Given("open the browser")
	public void open_the_browser() 
	{
		System.setProperty("webdriver.gecko.driver","/Users/kirankumaryadav/eclipse/selenium/democucumber/democucumber/src/test/resources/drivers/geckodriver");
		driver=new FirefoxDriver();
		
	    }

	@And("navigate to the feature page")
	public void navigate_to_the_feature_page() 
	{
		driver.navigate().to("https://www.facebook.com/login/");
		
	   }

	@When("enter the required details")
	public void enter_the_required_details()
	{
		driver.findElement(By.id("email")).sendKeys("7981297987");
		
		driver.findElement(By.id("pass")).sendKeys("Kiran.kumar@1505");
		 
	}

	@And("clkckon the enter")
	public void clkckon_the_enter() 
	{
		driver.findElement(By.name("login")).click();
	 }

	@Then("navigate to its page")
	public void navigate_to_its_page() 
	{
		driver.close();
	 }
}

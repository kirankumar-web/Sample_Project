package stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demologinsteps 
{   WebDriver dr= null;
    @Given("launch browser")
	public void launch_browser() 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver");
		dr=new ChromeDriver(co);
		 }
	@And("User is on login page")
	public void user_is_on_login_page() 
	{
		dr.navigate().to("https://example.testproject.io/web/");
		dr.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
	    }
	@When("user enter login credentials")
	public void user_enter_login_credentials() throws InterruptedException 
	{
		dr.findElement(By.id("name")).sendKeys("kiran");
		dr.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		dr.findElement(By.id("password")).sendKeys("12345");
		dr.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		Thread.sleep(2000);
      }
	@And("press login button")
	public void press_login_button() throws InterruptedException 
	{
		dr.findElement(By.id("login")).click();
		Thread.sleep(2000);
	    }
	@Then("navigated to homescreen")
	public void navigated_to_homescreen() throws InterruptedException 
	{
		dr.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		dr.close();
	    }
}


package stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parametraisationsteps 
{
    WebDriver dr= null;
	@Given("open the required browser")
	public void open_the_required_browser() 
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		dr=new ChromeDriver(co);
	}

	@And("enter login page url")
	public void enter_login_page_url()
	{
		dr.navigate().to("https://example.testproject.io/web/");
		dr.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
	    
	}

//	@When("^enter (.*) and (.*)$")
//	public void enter_username_and_password(String username, String password)  
//	{
//		dr.findElement(By.id("name")).sendKeys(username);
//		
//		dr.findElement(By.id("password")).sendKeys(password);
//		
//	}
	@And("press the login button")
	public void press_the_login_button() throws InterruptedException 
	{
		dr.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}

	@Then("homepage is displayed")
	public void homepage_is_displayed() throws InterruptedException  
	{
		dr.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		dr.close();
	}

}

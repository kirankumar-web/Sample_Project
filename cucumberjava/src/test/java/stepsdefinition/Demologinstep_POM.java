
package stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demologinstep_POM 
{
//    WebDriver driver= null;
//    Loginpage lop;
//	@Given("open the browser")
//	public void open_the_browser() 
//	{
//		System.out.println("---Page object Model Test Starts---");
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver");
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		driver=new ChromeDriver(co);
//	}
//
//	@And("enter login page url")
//	public void enter_login_page_url()
//	{
//		driver.navigate().to("https://example.testproject.io/web/");
//		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
//	}
//	@When("^enter (.*) and (.*)$")
//	public void enter_username_and_password(String username, String password)  
//	{
//		lop=new  Loginpage(driver);
//		lop.enterusername(username);
//		lop.enterpassword(password);
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);		
//	}
//	@And("press the login button")
//	public void press_the_login_button() throws InterruptedException 
//	{
//		lop.clickonlogin();
//
//		//driver.findElement(By.id("login")).click();
//		Thread.sleep(2000);
//	}
//
//	@Then("homepage is displayed")
//	public void homepage_is_displayed() throws InterruptedException  
//	{
//		lop.clickonlogout();
//		driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(3000);
//		driver.close();
//	}

}

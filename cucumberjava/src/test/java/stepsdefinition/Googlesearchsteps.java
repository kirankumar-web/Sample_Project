package stepsdefinition;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class Googlesearchsteps 
{
	WebDriver driver= null;
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException 
	{
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver= new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		
		
		driver.manage().window().maximize();
		}

	@And("user in on google search page")
	public void user_in_on_google_search_page() 
	{
		driver.get("https://www.google.com/");
		}

	@When("user enters a text in google search")
	public void user_enters_a_text_in_google_search() {
		driver.findElement(By.name("q")).sendKeys("kirankumar yadav");
	}

	@And("clickon enter")
	public void clickon_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user navigated to search result page")
	public void user_navigated_to_search_result_page() {
		driver.getPageSource().concat("Kirankumar Yadav - Data Scientist - Tata Consultancy Services");
		driver.close();
		driver.quit();
	}

}

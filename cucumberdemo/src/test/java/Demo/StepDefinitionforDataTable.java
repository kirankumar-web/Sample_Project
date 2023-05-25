package Demo;

import java.time.Duration;
import java.util.Map;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionforDataTable 
{
	WebDriver driver=null;
	@Given("user navigate to the Login URL")
	public void user_navigate_to_the_login_url()
	{
		 ChromeOptions co=new ChromeOptions();
			co.addArguments("---remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","/Users/kirankumaryadav/eclipse/selenium/cucumberjava/src/test/resources/Drivers/chromedriver 2");
		driver = new ChromeDriver(co);
 
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@When("^user enter login credential$")
	public void user_enter_student_and_password(DataTable Table) throws InterruptedException
	{
		  java.util.List<Map<String, String>> users = Table.asMaps(String.class, String.class);
          for (Map<String, String> input : users) {
			String un = input.get("username");
			String pw=input.get("password");
			
			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(un);
			Thread.sleep(2000);
			driver.findElement(By.name("//input[@name=\"password\"]")).sendKeys(pw);
		}
	}

	@And("click on login button")
	public void click_on_login_button()
	{
		driver.findElement(By.id("submit")).click();
	}

	@Then("user navigates to homepage")
	public void user_navigates_to_homepage()
	{
		WebElement a1 = driver.findElement(By.xpath("//a[text()=\"Practice\"]"));
		a1.isDisplayed();
		System.out.println(a1.isDisplayed());
	}
}

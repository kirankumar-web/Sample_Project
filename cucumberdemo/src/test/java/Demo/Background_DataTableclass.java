package Demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

import org.apache.xmlbeans.StringEnumAbstractBase.Table;
import org.openqa.selenium.Alert;
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

public class Background_DataTableclass {

		WebDriver driver=null;
		@Given("navigates to url")
		public void  navigates_to_url()
		{
			ChromeOptions co=new ChromeOptions();
			co.addArguments("---remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","/Users/kirankumaryadav/eclipse/selenium/cucumberjava/src/test/resources/Drivers/chromedriver 2");
			driver=new ChromeDriver(co);
			
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		}

		@When("^enter login credentials$")
		public void enter_login_credentials(DataTable dataTable) throws InterruptedException 
		{
			 java.util.List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
	          for (Map<String, String> input : users) {
				String un = input.get("username");
				String pw=input.get("password");
				
				driver.findElement(By.name("username")).sendKeys(un);
				Thread.sleep(2000);
				driver.findElement(By.name("password")).sendKeys(pw);
			}
		}

		@And("click login button")
		public void click_login_button() 
		{
			driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
			
		}

		@Then("navigates home page")
		public void navigates_home_page() 
		{
			 WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
			  System.out.println(search.isDisplayed());
			 search.sendKeys("My info");
		}

		@When("click on my info feature")
		public void click_on_my_info_feature() 
		{
			driver.findElement(By.xpath("//span[text()=\"My Info\"]")).click();
			driver.findElement(By.xpath("//a[text()=\"Contact Details\"]")).click();

		}

		@When("^enters the contact number$")
		public void enters_the_contact_number(DataTable dataTable2) 
		{
			java.util.List<Map<String, String>> users = dataTable2.asMaps(String.class, String.class);
	          for (Map<String, String> input : users) {
				String num = input.get("contactnumber");
				WebElement ele = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[8]"));
				ele.sendKeys(num);
				
	          }
	          
		}

		@And("click on save button")
		public void click_on_save_button()
		{
			driver.findElement(By.xpath("//button[text()=\" Save \"]")).click();
			Alert al=driver.switchTo().alert();
			String message = al.getText();
			System.out.println(message);
		}

		@Then("sucessfull message displayed")
		public void sucessfull_message_displayed()
		{
//			Alert al=driver.switchTo().alert();
//			String message = al.getText();
//			System.out.println(message);
		}

		@When("click-on my profile")
		public void click_on_my_profile() 
		{
			
		}

		@And("click-on logout button")
		public void click_on_logout_button()
		{
		}

		@Then("navigate login application")
		public void navigate_login_application() 
		{
			
		}
	}

		
	
package stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps 
{

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Actual step- user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Actual step- user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Actual step- user clickon on login button");
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("Actual step- user is navigate to home page");
	}

}

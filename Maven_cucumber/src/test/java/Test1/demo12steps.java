package Test1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo12steps
{
	@Given("user navigates to home page")
	public void user_navigates_to_home_page() 
	{
		System.out.println("Actual step- user is on login page");

	}

	@When("user click on user details")
	public void user_click_on_user_details() 
	{
		System.out.println("Actual step- user enters username and password");

	}

	@And("clicks on save option")
	public void clicks_on_save_option()
	{
		System.out.println("Actual step- user clickon on login button");

	}

	@Then("user navigates to home page with created user")
	public void user_navigates_to_home_page_with_created_user() 
	{
		System.out.println("Actual step- user is navigate to home page");

	}

}

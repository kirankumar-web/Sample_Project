package stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Feedbacksteps 
{
	@Given("the user navigates to javatpoint.com")
	public void the_user_navigates_to_javatpoint()  {
	    System.out.println("navigated to javatpoint");

	}

	@When("the user clicks on feedback, it navigates to feedback page")
	public void the_user_clicks_on_feedback_it_navigates_to_feedback_page() {
	    System.out.println("navigated to feedback page");
	}

	@And("the user Submit feedbaack message")
	public void the_user_submit_feedbaack_message()
	{
		System.out.println("Submitted Feedback message");
	}

	@Then("feedbback should received on the admin page")
	public void feedbback_should_received_on_the_admin_page() {
	    System.out.println("feedback received on admin page");
	}

	@And("admin can reply to the user")
	public void admin_can_reply_to_the_user() {
	    System.out.println("admin replied");
	}

}

package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsletterSteps extends Initialization{

	@When("user navigates to newsletter section and entrer email id")
	public void user_navigates_to_newsletter_section_and_entrer_email_id() {
	   allObj.getNewsletterPage().getEmail().sendKeys("mohamedjakriyaa@gmail.com");
	   allObj.getNewsletterPage().getSubscribe().click();
	   
	}



	@Then("user verify the message")
	public void user_verify_the_message() {
		allObj.getNewsletterPage().getVerify().isDisplayed();
	}

	
}

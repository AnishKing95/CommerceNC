package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JwelrySteps extends Initialization {
	
	@When("user navigates to jwelry page")
	public void user_navigates_to_jwelry_page() {
	    
		allObj.getJwelryPage().getJwellary().click();
		
	}


	@When("click flower girl bracelet")
	public void click_flower_girl_bracelet() {
	 
		allObj.getJwelryPage().getJwellary().click();
		
	}

	
	@When("user click add to cart")
	public void user_click_add_to_cart() {
		
		allObj.getJwelryPage().getJwellary().click();
	   
	}

	@Then("user verify the message")
	public void user_verify_the_message() {
	  
		allObj.getJwelryPage().getJwellary().isDisplayed();
		
	}

	


}

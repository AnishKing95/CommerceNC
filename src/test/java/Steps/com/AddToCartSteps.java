package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps extends Initialization {
	
	
	@When("user navigates to gift card page")
	public void user_navigates_to_gift_card_page() {
		
		allObj.getAddToCartPage().getGiftcardpage().click();
	    
	}

	

	@When("user click the virtual card add to cart button")
	public void user_click_the_virtual_card_add_to_cart_button() {
	    
		allObj.getAddToCartPage().getAddtocartbutton().click();
	}

	

	@When("user navigates to add to cart page")
	public void user_navigates_to_add_to_cart_page() throws InterruptedException {
		
		Thread.sleep(2000);
	   
		allObj.getAddToCartPage().getRecipientname().sendKeys("Karthick");
		allObj.getAddToCartPage().getRecipientemail().sendKeys("karthicksuresh98@gmail.com");
		//allObj.getAddToCartPage().getYourname().sendKeys("Anish");
		//allObj.getAddToCartPage().getYouremail().sendKeys("anishbaksh95@gmail.com");
		allObj.getAddToCartPage().getMessage().sendKeys("Scenario completed");
			
	}

	

	@When("user fill the valid credentials in the given forms")
	public void user_fill_the_valid_credentials_in_the_given_forms() {
	   
		allObj.getAddToCartPage().getAddtocartbuttonlast().click();
	}

	

	@Then("user verify message")
	public void user_verify_message() throws InterruptedException {
		
		Thread.sleep(3000);
	    
		allObj.getAddToCartPage().getVerifymessage().isDisplayed();
		
	}

	


}

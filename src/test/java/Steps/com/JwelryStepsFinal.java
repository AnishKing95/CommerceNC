package Steps.com;

import java.sql.Date;

import Initialization.Initialization;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JwelryStepsFinal extends Initialization {
	
	@When("user navigates to jwelry page")
	public void user_navigates_to_jwelry_page() {
	    
		allObj.getJwelryPageFinal().getJwelry().click();
		
	}
	
	@When("click elegant gemstone necklace rent")
	public void click_elegant_gemstone_necklace_rent() {
	    
		allObj.getJwelryPageFinal().getNecklace().click();
	}

	

	@When("user select start date end date and click rent")
	public void user_select_start_date_end_date_and_click_rent() throws InterruptedException {
		
		Thread.sleep(3000);
		
		
		
		allObj.getJwelryPageFinal().getStdate().sendKeys("2/3/2023");
		
		allObj.getJwelryPageFinal().getEdate().sendKeys("2/4/2023");
		
		allObj.getJwelryPageFinal().getAddcart().click();
	    
	}

	

	@Then("user verify the final message")
	public void user_verify_the_final_message() throws InterruptedException {
		
		Thread.sleep(2000);
		
		allObj.getJwelryPageFinal().getVerify().isDisplayed();
	    
	}

	

}

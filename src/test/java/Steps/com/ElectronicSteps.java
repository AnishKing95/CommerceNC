package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElectronicSteps extends Initialization {

	@When("user navigates to electronic page")
	public void user_navigates_to_electronic_page() {

		allObj.getElectronicPage().getElectronics().click();

	}

	@When("click phone icon")
	public void click_phone_icon() {

		allObj.getElectronicPage().getCellphone().click();

	}

	@Then("user lands on cell phones page")
	public void user_lands_on_cell_phones_page() {

		allObj.getElectronicPage().getSortby().isDisplayed();

	}
	
	@When("user navigates to electronics page and click cellphone window")
	public void user_navigates_to_electronics_page_and_click_cellphone_window() {
		allObj.getElectronicPage().getElectronics().click();
		
		allObj.getElectronicPage().getCellphone().click();
		
		allObj.getElectronicPage().getMobile().click();
	}

}

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

}

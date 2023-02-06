package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressSteps extends Initialization {

	@Given("users can be navigate to the addresses")
	public void users_can_be_navigate_to_the_addresses() {
		allObj.addressPage().getAddresses().click();

	}

	@Given("users add new click")
	public void users_add_new_click() {
		allObj.addressPage().getAddNew().click();

	}

	@When("users Add new address page")
	public void users_add_new_address_page() {
		allObj.addressPage().getFirstName().sendKeys("TAMIL");
		allObj.addressPage().getLastName().sendKeys("VANAN");
		allObj.addressPage().getEmail().sendKeys("tamilvananf6@gmail.com");
		allObj.addressPage().getCompany().sendKeys("skill");
		allObj.addressPage().getCountry().sendKeys("india");
		allObj.addressPage().getCity().sendKeys("thanjavur");
		allObj.addressPage().getCompany().click();
		allObj.addressPage().getAddress1().sendKeys("2827 krishna puram");
		allObj.addressPage().getAddress2().sendKeys("manojippatti , thanjavur");
		allObj.addressPage().getPincord().sendKeys("613004");
		allObj.addressPage().getPhoneNumber().sendKeys("9159015921");
		allObj.addressPage().getFaxNumber().sendKeys("9585015857");
		allObj.addressPage().getSave().click();

	}

	@Then("check the verify message in The new address has been added successfully.")
	public void check_the_verify_message_in_the_new_address_has_been_added_successfully() {

		allObj.addressPage().getShow().isDisplayed();
	}

}

package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NoteBookStep extends Initialization {

	@Given("user can be navigate to the computer and notebook")
	public void user_can_be_navigate_to_the_computer_and_notebook() {
		allObj.noteBookPage().getComputer().click();
		allObj.noteBookPage().getNoteBook().click();
		allObj.noteBookPage().getLaptop().click();
//		allObj.noteBookPage().getAddToCart().click();
//		allObj.noteBookPage().getAddToCart().click();
		allObj.noteBookPage().getShopingCart().click();
		allObj.noteBookPage().getTick().click();
		allObj.noteBookPage().getCheckOut().click();

	}

	@When("user to the click of checkout")
	public void user_to_the_click_of_checkout() throws InterruptedException {
		allObj.noteBookPage().getCountry().sendKeys("india");
		allObj.noteBookPage().getCity().sendKeys("thanjavur");
		allObj.noteBookPage().getAddress1().sendKeys("2827 krishna puram");
		allObj.noteBookPage().getAddress2().sendKeys("manojippatti , thanjavur");
		allObj.noteBookPage().getPincode().sendKeys("613004");
		allObj.noteBookPage().getPhNumber().sendKeys("9159015921");
		allObj.noteBookPage().getFaxNum().sendKeys("9585015857");
		allObj.noteBookPage().getContineu().click();
		Thread.sleep(3000);
		allObj.noteBookPage().getShippingmethod().click();
		Thread.sleep(3000);
		allObj.noteBookPage().getPaymentmethod().click();
		Thread.sleep(3000);
		allObj.noteBookPage().getPaymentinformation().click();
		Thread.sleep(3000);
		allObj.noteBookPage().getOrderconform().click();
		
	}

	@Then("user show the  Your order has been successfully processed message.")
	public void user_show_the_your_order_has_been_successfully_processed_message() throws InterruptedException {
		Thread.sleep(5000);
		allObj.noteBookPage().getThankyou().isDisplayed();
	}

}
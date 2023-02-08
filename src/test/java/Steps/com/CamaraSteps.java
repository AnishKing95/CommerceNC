package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.*;

public class CamaraSteps extends Initialization {

	@When("user can be navigate to the Electronics and user click the camara & photo of add to cart")
	public void user_can_be_navigate_to_the_electronics_and_user_click_the_camara_photo_of_add_to_cart()
			throws InterruptedException {
		allObj.getCamaraPage().getElectronics().click();
		allObj.getCamaraPage().getImg().click();
		allObj.getCamaraPage().getImg2().click();
		allObj.getCamaraPage().getCamara().click();
		allObj.getCamaraPage().getTick().click();
		allObj.getCamaraPage().getCheckout().click();

		Thread.sleep(3000);
	}

	@When("user Add new address page")
	public void user_add_new_address_page() throws InterruptedException {

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
		Thread.sleep(5000);
	}

	@Then("user verify Your order has been successfully processed message in showing")
	public void user_verify_your_order_has_been_successfully_processed_message_in_showing()
			throws InterruptedException {

		Thread.sleep(5000);
		allObj.noteBookPage().getThankyou().isDisplayed();

	}

}

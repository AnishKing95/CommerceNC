package Steps.com;

import org.openqa.selenium.WebElement;

import Initialization.Initialization;
import io.cucumber.java.en.*;

public class EmailSteps extends Initialization {

	@When("user navigate the electronis and click the camera and photo")
	public void user_navigate_the_electronis_and_click_the_camera_and_photo() {
		WebElement electronics = allObj.getEmailPage().getElectronics();
		electronics.click();
		allObj.getEmailPage().getCameraAndPhoto().click();
		
		
	}



	@When("user click the add cart")
	public void user_click_the_add_cart() {
		allObj.getEmailPage().getAddCart().click();
	 
	}



	@Then("user click the email a friend and enter the both mail id  and optional message")
	public void user_click_the_email_a_friend_and_enter_the_both_mail_id_and_optional_message() throws InterruptedException {
		Thread.sleep(3000);
		allObj.getEmailPage().getEmailAFriend().click();
		allObj.getEmailPage().getFriendEmail().sendKeys("mohamedjakriyaa@gmail.com");
		//allObj.getEmailPage().getYourEmail().sendKeys("anishbaksh95@gmail.com");
		allObj.getEmailPage().getPersonalMessage().sendKeys("HI product has been ready to shipped");
		allObj.getEmailPage().getSendEmail().click();
	
	}



	@Then("verify the email has been sent")
	public void verify_the_email_has_been_sent() {
		
		
	
	}


}

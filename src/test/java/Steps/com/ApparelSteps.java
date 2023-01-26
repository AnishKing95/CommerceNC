package Steps.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Initialization.Initialization;
import PageObjects.ApparelPage;
import io.cucumber.java.en.*;

public class ApparelSteps extends Initialization {


@When("user navigate the apparel and click the shoes")
public void user_navigate_the_apparel_and_click_the_shoes() {
	
	
	WebElement apparel = allObj.getApperalPage().getApparel();
	apparel.click();
	allObj.getApperalPage().getShoes().click();
	allObj.getApperalPage().getShoesSelected().click();
	
   
}


@Then("check the visibility of size drop down")
public void check_the_visibility_of_size_drop_down() throws InterruptedException {

	Thread.sleep(3000);
	Actions ac = new Actions(driver);
	ac.scrollToElement(allObj.getApperalPage().getSizeDropDown());
	allObj.getApperalPage().getSizeDropDown().isDisplayed();
	
}

}

package Steps.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PageObjects.ApparelPage;
import congifuration.Initialization;
import io.cucumber.java.en.*;

public class ApparelSteps extends Initialization {


public ApparelPage apparelPage;

@When("user navigate the apparel and click the shoes")
public void user_navigate_the_apparel_and_click_the_shoes() {
	
	apparelPage=PageFactory.initElements(driver, ApparelPage.class);
	
	WebElement apparel = apparelPage.getApparel();
	apparel.click();
	apparelPage.getShoes().click();
	apparelPage.getShoesSelected().click();
	
   
}


@Then("check the visibility of size drop down")
public void check_the_visibility_of_size_drop_down() throws InterruptedException {
	apparelPage=PageFactory.initElements(driver, ApparelPage.class);
	Thread.sleep(3000);
	Actions ac = new Actions(driver);
	ac.scrollToElement(apparelPage.getSizeDropDown());
	apparelPage.getSizeDropDown().isDisplayed();
	
}

}

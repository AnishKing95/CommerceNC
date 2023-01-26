package Steps.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.DigitalDownloadsPage;
import PageObjects.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DigitalDownloadsSteps {
	
	DigitalDownloadsPage digitalPage;
	WebDriver driver;
	
	@When("user navigates digital downloads and click add to cart")
	public void user_navigates_digital_downloads_and_click_add_to_cart() {
		
		digitalPage=PageFactory.initElements(driver, DigitalDownloadsPage.class);
		
		digitalPage.getDigiDownB().click();
		
		digitalPage.getAddCart().click();
		
	}

	

	@When("user click download sample")
	public void user_click_download_sample() {
		digitalPage.getDownload().click();
	}

	

	@Then("file will downloaded")
	public void file_will_downloaded() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}

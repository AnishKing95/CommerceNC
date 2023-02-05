package Steps.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Initialization.Initialization;
import congifuration.FileConfig;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerSteps extends Initialization {

	@When("user navigates to computers page and click desktop window")
	public void user_navigates_to_computers_page_and_click_desktop_window() {
		allObj.getComputerPage().getComputer().click();

		allObj.getComputerPage().getDesktop().click();

	}

	@When("user click add to cart")
	public void user_click_add_to_cart() {
		allObj.getComputerPage().getAddToCart().click();
	}

	@When("user select ram hdd and click add to cart")
	public void user_select_ram_hdd_and_click_add_to_cart() throws InterruptedException {

		Thread.sleep(3000);
		WebElement ram = allObj.getComputerPage().getRam();
		ram.click();
		Select sc = new Select(ram);
		sc.selectByIndex(2);

		allObj.getComputerPage().getHdd().click();

		allObj.getComputerPage().getAddToCart1().click();

	}

	@When("user checkout the product")
	public void user_checkout_the_product() throws InterruptedException {
		allObj.getComputerPage().getHome().click();

		allObj.getComputerPage().getShowCart().click();

		allObj.getComputerPage().getRadioButton().click();

		allObj.getComputerPage().getCkeckout().click();

		allObj.getComputerPage().getfName().sendKeys("Anish");

		allObj.getComputerPage().getlName().sendKeys("Raja");

		allObj.getComputerPage().getCompany().sendKeys("SkillPits");

		WebElement country = allObj.getComputerPage().getCountry();
		Select sc = new Select(country);
		sc.selectByVisibleText("India");

		allObj.getComputerPage().getCity().sendKeys("thanjavur");

		allObj.getComputerPage().getAddress().sendKeys("big street");

		allObj.getComputerPage().getPosatalCode().sendKeys("612001");

		allObj.getComputerPage().getNumber().sendKeys("1234567890");

		allObj.getComputerPage().getContinue1().click();
		Thread.sleep(2000);

		allObj.getComputerPage().getConfirm1().click();
		Thread.sleep(2000);
		allObj.getComputerPage().getConfirm2().click();
		Thread.sleep(2000);
		allObj.getComputerPage().getConfirm3().click();
		Thread.sleep(2000);
		allObj.getComputerPage().getConfirm4().click();

	}

	@Then("product is ordered")
	public void product_is_ordered() throws InterruptedException {

		Thread.sleep(2000);
		allObj.getComputerPage().getSuccess().isDisplayed();
	}

}

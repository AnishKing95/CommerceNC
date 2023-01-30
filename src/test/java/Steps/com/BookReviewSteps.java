package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookReviewSteps extends Initialization {
	@Given("users navigate to any book screen")
	public void users_navigate_to_any_book_screen() throws InterruptedException {
		allObj.getBookReviewPage().getBooks().click();
		Thread.sleep(3000);
		allObj.getBookReviewPage().getBookIm().click();

	}

	@When("user add the review")
	public void user_add_the_review() {
		allObj.getBookReviewPage().getAddRew().click();

	}

	@Then("user can be able to see the review message")
	public void user_can_be_able_to_see_the_review_message() {

		allObj.getBookReviewPage().getReviewTitle().sendKeys("tamilvananf6@gmail.com");
		allObj.getBookReviewPage().getReviewText().sendKeys("1234567890");
		allObj.getBookReviewPage().getExcellent5().click();
		allObj.getBookReviewPage().getSubmit().click();

		
		System.out.println("show the review" +driver.getTitle());
	}
	


}

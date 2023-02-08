package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToWishStep extends Initialization {

	@When("user naviget to books and user click add to wishlist")
	public void user_naviget_to_books_and_user_click_add_to_wishlist() {
		allObj.getAddToWishPage().getBooks().click();
		allObj.getAddToWishPage().getImg().click();
		allObj.getAddToWishPage().getAddToWish().click();
	}

	@Then("user verify the wishlist cart")
	public void user_verify_the_wishlist_cart() {
		allObj.getAddToWishPage().getAddToWish().isDisplayed();
	}

}

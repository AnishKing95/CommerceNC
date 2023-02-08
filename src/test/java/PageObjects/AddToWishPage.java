
package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishPage {

	@FindBy(xpath = "(//a[text()='Books '])[3]")
	private WebElement Books;

	@FindBy(xpath = "(//img[@alt='Picture of Pride and Prejudice'])[2]")
	private WebElement Img;

	@FindBy(xpath = "(//button[@id='add-to-wishlist-button-39'])")
	private WebElement AddToWish;

	@FindBy(xpath = "(//a[text()='wishlist'])")
	private WebElement wishlist;

	public WebElement getBooks() {
		return Books;
	}

	public void setBooks(WebElement books) {
		Books = books;
	}

	public WebElement getImg() {
		return Img;
	}

	public void setImg(WebElement img) {
		Img = img;
	}

	public WebElement getAddToWish() {
		return AddToWish;
	}

	public void setAddToWish(WebElement addToWish) {
		AddToWish = addToWish;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public void setWishlist(WebElement wishlist) {
		this.wishlist = wishlist;
	}

}

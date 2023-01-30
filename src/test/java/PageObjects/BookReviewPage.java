package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class BookReviewPage {

	
	@FindBy(xpath = "(//a[text()='Books '])[1]")
	private WebElement Books;
	
	
	@FindBy(xpath = "(//img[@alt='Picture of Pride and Prejudice'])")
	private WebElement bookIm;

	@FindBy(xpath = "//a[text()='Add your review']")
	private WebElement AddRew;

	@FindBy(id = "AddProductReview_Title")
	private WebElement ReviewTitle;

	@FindBy(xpath = "//textarea[@id='AddProductReview_ReviewText']")
	private WebElement ReviewText;

	@FindBy(xpath = "//input[@id='addproductrating_5']")
	private WebElement Excellent5;

	@FindBy(xpath="//button[@name='add-review']")
	private WebElement Submit;

	public WebElement getBooks() {
		return Books;
	}

	public void setBooks(WebElement books) {
		Books = books;
	}

	public WebElement getBookIm() {
		return bookIm;
	}

	public void setBookIm(WebElement bookIm) {
		this.bookIm = bookIm;
	}

	public WebElement getAddRew() {
		return AddRew;
	}

	public void setAddRew(WebElement addRew) {
		AddRew = addRew;
	}

	public WebElement getReviewTitle() {
		return ReviewTitle;
	}

	public void setReviewTitle(WebElement reviewTitle) {
		ReviewTitle = reviewTitle;
	}

	public WebElement getReviewText() {
		return ReviewText;
	}

	public void setReviewText(WebElement reviewText) {
		ReviewText = reviewText;
	}

	public WebElement getExcellent5() {
		return Excellent5;
	}

	public void setExcellent5(WebElement excellent5) {
		Excellent5 = excellent5;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public void setSubmit(WebElement submit) {
		Submit = submit;
	}
	
	
	
	
	
}

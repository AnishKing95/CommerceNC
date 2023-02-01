package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JwelryPage {
	
	@FindBy(xpath = "(//a[text()='Jewelry '])[1]")
	private WebElement jwellary;
	
	@FindBy(xpath = "(//a[text()='Flower Girl Bracelet'])[1]")
	private WebElement bracelet;
	
	@FindBy(id = "add-to-cart-button-41")
	private WebElement addtocart;
	
	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement message;

	public WebElement getJwellary() {
		return jwellary;
	}

	public void setJwellary(WebElement jwellary) {
		this.jwellary = jwellary;
	}

	public WebElement getBracelet() {
		return bracelet;
	}

	public void setBracelet(WebElement bracelet) {
		this.bracelet = bracelet;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public void setAddtocart(WebElement addtocart) {
		this.addtocart = addtocart;
	}

	public WebElement getMessage() {
		return message;
	}

	public void setMessage(WebElement message) {
		this.message = message;
	}

	
	
}

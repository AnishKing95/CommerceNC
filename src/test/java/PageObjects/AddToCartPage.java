package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage {
	
	@FindBy(xpath = "(//a[text()='Gift Cards '])[1]")
	private WebElement giftcardpage;
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
	private WebElement addtocartbutton;
	
	@FindBy(id = "giftcard_43_RecipientName")
	private WebElement recipientname;
	
	@FindBy(id = "giftcard_43_RecipientEmail")
	private WebElement recipientemail;
	
	@FindBy(id = "giftcard_43_SenderName")
	private WebElement yourname;
	
	@FindBy(id = "giftcard_43_SenderEmail")
	private WebElement youremail;
	
	@FindBy(id = "giftcard_43_Message")
	private WebElement message;
	
	@FindBy(id = "add-to-cart-button-43")
	private WebElement addtocartbuttonlast;
	
	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement verifymessage;

	public WebElement getGiftcardpage() {
		return giftcardpage;
	}

	public void setGiftcardpage(WebElement giftcardpage) {
		this.giftcardpage = giftcardpage;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}

	public void setAddtocartbutton(WebElement addtocartbutton) {
		this.addtocartbutton = addtocartbutton;
	}

	public WebElement getRecipientname() {
		return recipientname;
	}

	public void setRecipientname(WebElement recipientname) {
		this.recipientname = recipientname;
	}

	public WebElement getRecipientemail() {
		return recipientemail;
	}

	public void setRecipientemail(WebElement recipientemail) {
		this.recipientemail = recipientemail;
	}

	public WebElement getYourname() {
		return yourname;
	}

	public void setYourname(WebElement yourname) {
		this.yourname = yourname;
	}

	public WebElement getYouremail() {
		return youremail;
	}

	public void setYouremail(WebElement youremail) {
		this.youremail = youremail;
	}

	public WebElement getMessage() {
		return message;
	}

	public void setMessage(WebElement message) {
		this.message = message;
	}

	public WebElement getAddtocartbuttonlast() {
		return addtocartbuttonlast;
	}

	public void setAddtocartbuttonlast(WebElement addtocartbuttonlast) {
		this.addtocartbuttonlast = addtocartbuttonlast;
	}

	public WebElement getVerifymessage() {
		return verifymessage;
	}

	public void setVerifymessage(WebElement verifymessage) {
		this.verifymessage = verifymessage;
	}
	

}


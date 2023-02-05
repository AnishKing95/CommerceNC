package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterPage {

	@FindBy(id="newsletter-email")
	private WebElement email;
	
	@FindBy(id="newsletter-subscribe-button")
	private WebElement subscribe;
	
	@FindBy(id="newsletter-result-block")
	private WebElement verify;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(WebElement subscribe) {
		this.subscribe = subscribe;
	}

	public WebElement getVerify() {
		return verify;
	}

	public void setVerify(WebElement verify) {
		this.verify = verify;
	}
}

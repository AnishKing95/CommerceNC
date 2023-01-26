package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadsPage {
	
	@FindBy(xpath="(//a[text()='Digital downloads '])[1]")
	private WebElement digiDownB;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement addCart;
	
	@FindBy(xpath="//a[text()='Download sample']")
	private WebElement download;

	public WebElement getDigiDownB() {
		return digiDownB;
	}

	public void setDigiDownB(WebElement digiDownB) {
		this.digiDownB = digiDownB;
	}

	public WebElement getAddCart() {
		return addCart;
	}

	public void setAddCart(WebElement addCart) {
		this.addCart = addCart;
	}

	public WebElement getDownload() {
		return download;
	}

	public void setDownload(WebElement download) {
		this.download = download;
	}

}

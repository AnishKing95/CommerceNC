package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JwelryPageFinal {
	
	@FindBy(xpath="(//a[text()='Jewelry '])[1]")
	private WebElement jwelry;
	
	@FindBy(xpath="//button[text()='Rent']")
	private WebElement necklace;
	
	@FindBy(id="rental_start_date_40")
	private WebElement stdate;
	
	@FindBy(id="rental_end_date_40")
	private WebElement edate;
	
	@FindBy(id="add-to-cart-button-40")
	private WebElement addcart;
	
	@FindBy(xpath="//a[text()='shopping cart']")
	private WebElement verify;
	
	

	public WebElement getVerify() {
		return verify;
	}

	public void setVerify(WebElement verify) {
		this.verify = verify;
	}

	public WebElement getJwelry() {
		return jwelry;
	}

	public void setJwelry(WebElement jwelry) {
		this.jwelry = jwelry;
	}

	public WebElement getNecklace() {
		return necklace;
	}

	public void setNecklace(WebElement necklace) {
		this.necklace = necklace;
	}

	public WebElement getStdate() {
		return stdate;
	}

	public void setStdate(WebElement stdate) {
		this.stdate = stdate;
	}

	public WebElement getEdate() {
		return edate;
	}

	public void setEdate(WebElement edate) {
		this.edate = edate;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public void setAddcart(WebElement addcart) {
		this.addcart = addcart;
	}

	
}

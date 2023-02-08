package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CamaraPage {

	public WebElement getElectronics() {
		return Electronics;
	}

	public void setElectronics(WebElement electronics) {
		Electronics = electronics;
	}

	public WebElement getImg() {
		return img;
	}

	public void setImg(WebElement img) {
		this.img = img;
	}

	@FindBy(xpath="(//a[text()='Electronics '])[1]")
	private WebElement Electronics;
	
	@FindBy(xpath="(//img[@alt='Picture for category Camera & photo'])")
	private WebElement img;
	
	@FindBy(xpath="(//button[@class='button-2 product-box-add-to-cart-button'])[2]")
	private WebElement img2;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement camara;
	
	
	@FindBy(xpath="(//span[text()='Shopping cart'])")
	private WebElement Shoppingcart;
	
	@FindBy(id="termsofservice")
	private WebElement tick;
	
	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	@FindBy(id="checkout")
	private WebElement checkout;


	public WebElement getTick() {
		return tick;
	}

	public void setTick(WebElement tick) {
		this.tick = tick;
	}

	public WebElement getImg2() {
		return img2;
	}

	public void setImg2(WebElement img2) {
		this.img2 = img2;
	}

	public WebElement getCamara() {
		return camara;
	}

	public void setCamara(WebElement camara) {
		this.camara = camara;
	}

	public WebElement getShoppingcart() {
		return Shoppingcart;
	}

	public void setShoppingcart(WebElement shoppingcart) {
		Shoppingcart = shoppingcart;
	}
	
	
	
	
}

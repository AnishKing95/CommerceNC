package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage {

	@FindBy(xpath = "(//a[text()='Computers '])[1]")
	private WebElement computer;

	@FindBy(xpath = "//a[text()=' Desktops ']")
	private WebElement desktop;

	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")
	private WebElement addToCart;

	@FindBy(id = "product_attribute_2")
	private WebElement ram;

	@FindBy(id = "product_attribute_3_6")
	private WebElement hdd;

	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement addToCart1;

	@FindBy(xpath = "//span[text()='Home']")
	private WebElement home;

	public WebElement getComputer() {
		return computer;
	}

	public void setComputer(WebElement computer) {
		this.computer = computer;
	}

	public WebElement getDesktop() {
		return desktop;
	}

	public void setDesktop(WebElement desktop) {
		this.desktop = desktop;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public WebElement getRam() {
		return ram;
	}

	public void setRam(WebElement ram) {
		this.ram = ram;
	}

	public WebElement getHdd() {
		return hdd;
	}

	public void setHdd(WebElement hdd) {
		this.hdd = hdd;
	}

	public WebElement getAddToCart1() {
		return addToCart1;
	}

	public void setAddToCart1(WebElement addToCart1) {
		this.addToCart1 = addToCart1;
	}

	public WebElement getHome() {
		return home;
	}

	public void setHome(WebElement home) {
		this.home = home;
	}

	public WebElement getShowCart() {
		return showCart;
	}

	public void setShowCart(WebElement showCart) {
		this.showCart = showCart;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public void setRadioButton(WebElement radioButton) {
		this.radioButton = radioButton;
	}

	public WebElement getCkeckout() {
		return ckeckout;
	}

	public void setCkeckout(WebElement ckeckout) {
		this.ckeckout = ckeckout;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getPosatalCode() {
		return posatalCode;
	}

	public void setPosatalCode(WebElement posatalCode) {
		this.posatalCode = posatalCode;
	}

	public WebElement getNumber() {
		return number;
	}

	public void setNumber(WebElement number) {
		this.number = number;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	public void setContinue1(WebElement continue1) {
		this.continue1 = continue1;
	}

	public WebElement getConfirm1() {
		return confirm1;
	}

	public void setConfirm1(WebElement confirm1) {
		this.confirm1 = confirm1;
	}

	public WebElement getConfirm2() {
		return confirm2;
	}

	public void setConfirm2(WebElement confirm2) {
		this.confirm2 = confirm2;
	}

	public WebElement getConfirm3() {
		return confirm3;
	}

	public void setConfirm3(WebElement confirm3) {
		this.confirm3 = confirm3;
	}

	public WebElement getConfirm4() {
		return confirm4;
	}

	public void setConfirm4(WebElement confirm4) {
		this.confirm4 = confirm4;
	}

	@FindBy(xpath = "//span[@class='cart-qty']")
	private WebElement showCart;

	@FindBy(id = "termsofservice")
	private WebElement radioButton;

	@FindBy(id = "checkout")
	private WebElement ckeckout;

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement fName;

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lName;

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement email;

	@FindBy(id = "BillingNewAddress_Company")
	private WebElement company;

	public WebElement getfName() {
		return fName;
	}

	public void setfName(WebElement fName) {
		this.fName = fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public void setlName(WebElement lName) {
		this.lName = lName;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getCompany() {
		return company;
	}

	public void setCompany(WebElement company) {
		this.company = company;
	}

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement country;

	@FindBy(id = "BillingNewAddress_City")
	private WebElement city;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement posatalCode;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement number;

	public WebElement getSuccess() {
		return success;
	}

	public void setSuccess(WebElement success) {
		this.success = success;
	}

	@FindBy(xpath = "(//button[text()='Continue'])[1]")
	private WebElement continue1;

	@FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
	private WebElement confirm1;

	@FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
	private WebElement confirm2;

	@FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
	private WebElement confirm3;

	@FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
	private WebElement confirm4;

	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement success;
}

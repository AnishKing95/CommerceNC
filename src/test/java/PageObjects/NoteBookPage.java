package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NoteBookPage {
	
	public WebElement getComputer() {
		return computer;
	}

	public void setComputer(WebElement computer) {
		this.computer = computer;
	}

	public WebElement getNoteBook() {
		return NoteBook;
	}

	public void setNoteBook(WebElement noteBook) {
		NoteBook = noteBook;
	}

	public WebElement getLaptop() {
		return laptop;
	}

	public void setLaptop(WebElement laptop) {
		this.laptop = laptop;
	}

//	public WebElement getAddToCart() {
//		return AddToCart;
//	}
//
//	public void setAddToCart(WebElement addToCart) {
//		AddToCart = addToCart;
//	}

	public WebElement getShopingCart() {
		return ShopingCart;
	}

	public void setShopingCart(WebElement shopingCart) {
		ShopingCart = shopingCart;
	}

	public WebElement getTick() {
		return Tick;
	}

	public void setTick(WebElement tick) {
		Tick = tick;
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}

	public void setCheckOut(WebElement checkOut) {
		CheckOut = checkOut;
	}

	@FindBy(xpath="(//a[text()='Computers '])[1]")
	private WebElement computer;
	
	@FindBy(xpath="//img[@title='Show products in category Notebooks']")
	private WebElement NoteBook;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[5]")
	private WebElement laptop;
	
//	@FindBy(id="add-to-cart-button-9")
//	private WebElement AddToCart;
	
	@FindBy(xpath="(//span[@class='cart-label'])")
	private WebElement ShopingCart;
	
	@FindBy(id="termsofservice")
	private WebElement Tick;
	
	@FindBy(id="checkout")
	private WebElement CheckOut;
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement country;
//	
	@FindBy(id="BillingNewAddress_City")
	private WebElement city ;
//	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement Address1;
	
	@FindBy(id="BillingNewAddress_Address2")
	private WebElement Address2;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement pincode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement PhNumber;
	
	@FindBy(id="BillingNewAddress_FaxNumber")
	private WebElement FaxNum;
	
	@FindBy(xpath="(//button[text()='Continue'])[1]")
	private WebElement contineu;
	
	@FindBy(xpath="(//button[text()='Continue'])[3]")
	private WebElement Shippingmethod;
	
	@FindBy(xpath="(//button[text()='Continue'])[4]")
	private WebElement Paymentmethod;
	
	@FindBy(xpath="(//button[text()='Continue'])[5]")
	private WebElement Paymentinformation;
	
	@FindBy(xpath="(//button[text()='Confirm'])")
	private WebElement Orderconform;
	
	@FindBy(xpath="//h1[text()='Thank you']")
	private WebElement thankyou;

	public WebElement getShippingmethod() {
		return Shippingmethod;
	}

	public void setShippingmethod(WebElement shippingmethod) {
		Shippingmethod = shippingmethod;
	}

	public WebElement getPaymentmethod() {
		return Paymentmethod;
	}

	public void setPaymentmethod(WebElement paymentmethod) {
		Paymentmethod = paymentmethod;
	}

	public WebElement getPaymentinformation() {
		return Paymentinformation;
	}

	public void setPaymentinformation(WebElement paymentinformation) {
		Paymentinformation = paymentinformation;
	}

	public WebElement getOrderconform() {
		return Orderconform;
	}

	public void setOrderconform(WebElement orderconform) {
		Orderconform = orderconform;
	}

	public WebElement getThankyou() {
		return thankyou;
	}

	public void setThankyou(WebElement thankyou) {
		this.thankyou = thankyou;
	}

	public WebElement getContineu() {
		return contineu;
	}

	public void setContineu(WebElement contineu) {
		this.contineu = contineu;
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

	public WebElement getAddress1() {
		return Address1;
	}

	public void setAddress1(WebElement address1) {
		Address1 = address1;
	}

	public WebElement getAddress2() {
		return Address2;
	}

	public void setAddress2(WebElement address2) {
		Address2 = address2;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public void setPincode(WebElement pincode) {
		this.pincode = pincode;
	}

	public WebElement getPhNumber() {
		return PhNumber;
	}

	public void setPhNumber(WebElement phNumber) {
		PhNumber = phNumber;
	}

	public WebElement getFaxNum() {
		return FaxNum;
	}

	public void setFaxNum(WebElement faxNum) {
		FaxNum = faxNum;
	}
	
}

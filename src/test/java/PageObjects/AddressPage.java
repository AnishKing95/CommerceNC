package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage {
	@FindBy(xpath = "(//a[text()='Addresses'])")
	private WebElement Addresses;
	
	@FindBy(xpath = "//button[text()='Add new']")
	private WebElement AddNew;
	
	@FindBy(id = "Address_FirstName")
	private WebElement FirstName;
	
	@FindBy(id = "Address_LastName")
	private WebElement LastName;
	
	@FindBy(id = "Address_Email")
	private WebElement Email;
	
	@FindBy(id = "Address_Company")
	private WebElement Company;
	
	@FindBy(xpath = "(//select[@id='Address_CountryId'])")
	private WebElement Country;
	
	@FindBy(id = "Address_City")
	private WebElement City;
	
	@FindBy(id = "Address_Address1")
	private WebElement Address1;
	
	@FindBy(id = "Address_Address2")
	private WebElement Address2;
	
	@FindBy(id = "Address_ZipPostalCode")
	private WebElement Pincord;
	
	@FindBy(id = "Address_PhoneNumber")
	private WebElement PhoneNumber;
	
	@FindBy(id = "Address_FaxNumber")
	private WebElement FaxNumber;
	
	@FindBy(xpath="(//button[text()='Save'])")
	private WebElement save;
	
	@FindBy(xpath="//p[text()='The new address has been added successfully.']")
	private WebElement show;
	
	public WebElement getShow() {
		return show;
	}

	public void setShow(WebElement show) {
		this.show = show;
	}

	public WebElement getSave() {
		return save;
	}

	public void setSave(WebElement save) {
		this.save = save;
	}

	public WebElement getAddresses() {
		return Addresses;
	}

	public void setAddresses(WebElement addresses) {
		Addresses = addresses;
	}

	public WebElement getAddNew() {
		return AddNew;
	}

	public void setAddNew(WebElement addNew) {
		AddNew = addNew;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public void setFirstName(WebElement firstName) {
		FirstName = firstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setLastName(WebElement lastName) {
		LastName = lastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(WebElement email) {
		Email = email;
	}

	public WebElement getCompany() {
		return Company;
	}

	public void setCompany(WebElement company) {
		Company = company;
	}

	public WebElement getCountry() {
		return Country;
	}

	public void setCountry(WebElement country) {
		Country = country;
	}

	public WebElement getCity() {
		return City;
	}

	public void setCity(WebElement city) {
		City = city;
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

	public WebElement getPincord() {
		return Pincord;
	}

	public void setPincord(WebElement pincord) {
		Pincord = pincord;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(WebElement phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public WebElement getFaxNumber() {
		return FaxNumber;
	}

	public void setFaxNumber(WebElement faxNumber) {
		FaxNumber = faxNumber;
	}
	
	

}

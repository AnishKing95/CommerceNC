package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement register;
	
	@FindBy(id="gender-male")
	private WebElement gender;
	
	@FindBy(id="FirstName")
	private WebElement fName;
	
	@FindBy(id="LastName")
	private WebElement lName;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	private WebElement day;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	private WebElement year;
	
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Company")
	private WebElement company;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement cPassword;
	
	@FindBy(id="register-button")
	private WebElement regBotton;
	
	
	public WebElement getRegister() {
		return register;
	}

	public void setRegister(WebElement register) {
		this.register = register;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

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

	public WebElement getDay() {
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
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

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getcPassword() {
		return cPassword;
	}

	public void setcPassword(WebElement cPassword) {
		this.cPassword = cPassword;
	}

	public WebElement getRegBotton() {
		return regBotton;
	}

	public void setRegBotton(WebElement regBotton) {
		this.regBotton = regBotton;
	}

	@FindBy(xpath="//input[@id='Email']")
	private WebElement userName;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement logIn;
	
	public WebElement getLogIn() {
		return logIn;
	}

	public void setLogIn(WebElement logIn) {
		this.logIn = logIn;
	}

	@FindBy(xpath="//input[@id='Password']")
	private WebElement passWord;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginBtn;


	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	

	
	
	

}

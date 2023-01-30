package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage {

	@FindBy(xpath="(//a[text()='Electronics '])[1]")
	private WebElement electronics;
	

	@FindBy(xpath="//a[text()=' Camera & photo ']")
	private WebElement cameraAndPhoto;
	

	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement addCart;
	

	@FindBy(xpath="(//button[text()='Email a friend'])[1]")
	private WebElement emailAFriend;
	

	@FindBy(id="FriendEmail")
	private WebElement friendEmail;
	

	@FindBy(id="YourEmailAddress")
	private WebElement yourEmail;
	
	@FindBy(id="PersonalMessage")
	private WebElement personalMessage;
	

	@FindBy(xpath="(//button[text()='Send email'])[1]")
	private WebElement sendEmail;

	
	@FindBy(xpath="//div[@class='result']")
	private WebElement verify;
	
	public WebElement getElectronics() {
		return electronics;
	}


	public WebElement getVerify() {
		return verify;
	}





	public void setElectronics(WebElement electronics) {
		this.electronics = electronics;
	}


	public WebElement getCameraAndPhoto() {
		return cameraAndPhoto;
	}


	public void setCameraAndPhoto(WebElement cameraAndPhoto) {
		this.cameraAndPhoto = cameraAndPhoto;
	}


	public WebElement getAddCart() {
		return addCart;
	}


	public void setAddCart(WebElement addCart) {
		this.addCart = addCart;
	}


	public WebElement getEmailAFriend() {
		return emailAFriend;
	}


	public void setEmailAFriend(WebElement emailAFriend) {
		this.emailAFriend = emailAFriend;
	}


	public WebElement getSendEmail() {
		return sendEmail;
	}


	public void setSendEmail(WebElement sendEmail) {
		this.sendEmail = sendEmail;
	}


	public WebElement getFriendEmail() {
		return friendEmail;
	}


	public void setFriendEmail(WebElement friendEmail) {
		this.friendEmail = friendEmail;
	}


	public WebElement getYourEmail() {
		return yourEmail;
	}


	public void setYourEmail(WebElement yourEmail) {
		this.yourEmail = yourEmail;
	}


	public WebElement getPersonalMessage() {
		return personalMessage;
	}


	public void setPersonalMessage(WebElement personalMessage) {
		this.personalMessage = personalMessage;
	}


}



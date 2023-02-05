package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage {

	
	@FindBy(xpath="//a[text()='View News Archive']")
	private WebElement newsArcive;
	
	@FindBy(xpath="(//a[text()='details'])[1]")
	private WebElement details;
	
	@FindBy(id="AddNewComment_CommentTitle")
	private WebElement title;
	
	public WebElement getNewsArcive() {
		return newsArcive;
	}

	public void setNewsArcive(WebElement newsArcive) {
		this.newsArcive = newsArcive;
	}

	public WebElement getDetails() {
		return details;
	}

	public void setDetails(WebElement details) {
		this.details = details;
	}

	public WebElement getTitle() {
		return title;
	}

	public void setTitle(WebElement title) {
		this.title = title;
	}

	public WebElement getText() {
		return text;
	}

	public void setText(WebElement text) {
		this.text = text;
	}

	public WebElement getNewComment() {
		return newComment;
	}

	public void setNewComment(WebElement newComment) {
		this.newComment = newComment;
	}

	public WebElement getVerify() {
		return verify;
	}

	public void setVerify(WebElement verify) {
		this.verify = verify;
	}

	@FindBy(id="AddNewComment_CommentText")
	private WebElement text;
	
	@FindBy(xpath="//button[text()='New comment']")
	private WebElement newComment;
	
	@FindBy(xpath="//div[text()='News comment is successfully added.']")
	private WebElement verify;
}

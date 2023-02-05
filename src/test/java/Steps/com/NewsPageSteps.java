package Steps.com;

import Initialization.Initialization;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsPageSteps extends Initialization{

	@When("user navigates to view news archive page and click details")
	public void user_navigates_to_view_news_archive_page_and_click_details() {
	    allObj.getNewsPage().getNewsArcive().click();
	    allObj.getNewsPage().getDetails().click();
	}

	

	@When("user write titile comment and click new comment")
	public void user_write_titile_comment_and_click_new_comment() {
		allObj.getNewsPage().getTitle().sendKeys("project");
		allObj.getNewsPage().getText().sendKeys("hi");
		allObj.getNewsPage().getNewComment().click();
	}

	

	@Then("news comment is successfully added")
	public void news_comment_is_successfully_added() {
		allObj.getNewsPage().getVerify().isDisplayed();
	}

}

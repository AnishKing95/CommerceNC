package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.ApparelPage;
import PageObjects.BookReviewPage;
import PageObjects.DigitalDownloadsPage;
import PageObjects.HomePage;




public class Initialization {
	
	public static WebDriver driver=new ChromeDriver();
	private static ApparelPage apparelPage;
	private static HomePage homePage;
	private static DigitalDownloadsPage digitalPage;
	private static BookReviewPage bookReviewPage;
	public static Initialization allObj;
    

	
	
	
	public  ApparelPage getApperalPage() {
				
		apparelPage=PageFactory.initElements(driver, ApparelPage.class);
		return apparelPage;

	}
	
	public  HomePage getHomePage() {
		
		homePage=PageFactory.initElements(driver, HomePage.class);
		return homePage;

	}
	
	public DigitalDownloadsPage getDigitalDownloadPage() {
		
		digitalPage=PageFactory.initElements(driver, DigitalDownloadsPage.class);
		return digitalPage;

	}
	
	
public BookReviewPage getBookReviewPage() {
		
		bookReviewPage=PageFactory.initElements(driver, BookReviewPage.class);
		return bookReviewPage;

	}
	
	
	
	public static void getAllObjects() {
		
		allObj = new Initialization();
		

	}
	
	
	
	
	
	
	
	
	
}

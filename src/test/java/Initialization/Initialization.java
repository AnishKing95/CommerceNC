package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.AddressPage;
import PageObjects.ApparelPage;
import PageObjects.BookReviewPage;
import PageObjects.DigitalDownloadsPage;
import PageObjects.HomePage;
import PageObjects.NoteBookPage;




public class Initialization {
	
	public static WebDriver driver=new ChromeDriver();
	private static ApparelPage apparelPage;
	private static HomePage homePage;
	private static DigitalDownloadsPage digitalPage;
	private static BookReviewPage bookReviewPage;
	private static AddressPage addressPage;
	private static NoteBookPage noteBookPage;
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

public  AddressPage addressPage() {
	
	addressPage=PageFactory.initElements(driver, AddressPage.class);
	return addressPage;

}

public  NoteBookPage noteBookPage() {
	
	noteBookPage=PageFactory.initElements(driver, NoteBookPage.class);
	return noteBookPage;

}

	
	
	
	
	public static void getAllObjects() {
		
		allObj = new Initialization();
		

	}
	
	
	
	
	
	
	
	
	
}

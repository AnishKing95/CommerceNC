package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.AddToCartPage;
import PageObjects.ApparelPage;
import PageObjects.BookReviewPage;
import PageObjects.ComputerPage;
import PageObjects.DigitalDownloadsPage;
import PageObjects.ElectronicPage;
import PageObjects.HomePage;
import PageObjects.JwelryPageFinal;

import PageObjects.EmailPage;
import PageObjects.NewsPage;





public class Initialization {

	public static WebDriver driver = new ChromeDriver();
	private static ApparelPage apparelPage;
	private static HomePage homePage;
	private static DigitalDownloadsPage digitalPage;
	private static AddToCartPage addToCartPage;
	private static JwelryPageFinal jwelryPageFinal;
	private static ElectronicPage electronicPage;

	private static EmailPage emailPage;
	private static BookReviewPage bookReviewPage;
	private static ComputerPage computerPage;
	private static NewsPage newsPage;
	
	public static Initialization allObj;

	public ApparelPage getApperalPage() {

		apparelPage = PageFactory.initElements(driver, ApparelPage.class);
		return apparelPage;

	}

	public HomePage getHomePage() {

		homePage = PageFactory.initElements(driver, HomePage.class);
		return homePage;

	}

	public DigitalDownloadsPage getDigitalDownloadPage() {

		digitalPage = PageFactory.initElements(driver, DigitalDownloadsPage.class);
		return digitalPage;

	}
	

	public  EmailPage getEmailPage() {
		emailPage=PageFactory.initElements(driver, EmailPage.class);
		return emailPage;
	}

	
public BookReviewPage getBookReviewPage() {
		
		bookReviewPage=PageFactory.initElements(driver, BookReviewPage.class);
		return bookReviewPage;

	}

public ComputerPage getComputerPage() {
	
	computerPage=PageFactory.initElements(driver, ComputerPage.class);
	return computerPage;

}

public NewsPage getNewsPage() {
	
	newsPage=PageFactory.initElements(driver, NewsPage.class);
	return newsPage;

}
	

	
	public AddToCartPage getAddToCartPage() {
		
		addToCartPage = PageFactory.initElements(driver, AddToCartPage.class);
		return addToCartPage; 
		
	}


	
	
	
	public JwelryPageFinal getJwelryPageFinal() {
		
		jwelryPageFinal = PageFactory.initElements(driver, JwelryPageFinal.class);
		return jwelryPageFinal;
	}

	
	

	public ElectronicPage getElectronicPage() {

		electronicPage = PageFactory.initElements(driver, ElectronicPage.class);
		return electronicPage;

	}

	public static void getAllObjects() {

		allObj = new Initialization();

	}

}

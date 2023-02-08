
package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.AddressPage;
import PageObjects.AddToCartPage;
import PageObjects.AddToWishPage;
import PageObjects.ApparelPage;
import PageObjects.BookReviewPage;
import PageObjects.CamaraPage;
import PageObjects.ComputerPage;
import PageObjects.DigitalDownloadsPage;
import PageObjects.ElectronicPage;
import PageObjects.HomePage;
import PageObjects.NoteBookPage;
import PageObjects.JwelryPageFinal;

import PageObjects.EmailPage;
import PageObjects.NewsPage;
import PageObjects.NewsletterPage;

public class Initialization {

	public static WebDriver driver = new ChromeDriver();
	private static ApparelPage apparelPage;
	private static HomePage homePage;
	private static DigitalDownloadsPage digitalPage;
	private static BookReviewPage bookReviewPage;
	private static AddressPage addressPage;
	private static NoteBookPage noteBookPage;
	private static CamaraPage camaraPage;
	public static Initialization allObj;

	private static AddToCartPage addToCartPage;
	private static JwelryPageFinal jwelryPageFinal;
	private static ElectronicPage electronicPage;
	private static EmailPage emailPage;
	private static ComputerPage computerPage;
	private static NewsPage newsPage;
	private static AddToWishPage addToWishPage;
	private static NewsletterPage newsletterPage;

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

	public EmailPage getEmailPage() {
		emailPage = PageFactory.initElements(driver, EmailPage.class);
		return emailPage;
	}

	public BookReviewPage getBookReviewPage() {

		bookReviewPage = PageFactory.initElements(driver, BookReviewPage.class);
		return bookReviewPage;

	}

	public AddressPage addressPage() {

		addressPage = PageFactory.initElements(driver, AddressPage.class);
		return addressPage;

	}

	public NoteBookPage noteBookPage() {

		noteBookPage = PageFactory.initElements(driver, NoteBookPage.class);
		return noteBookPage;

	}

	public ComputerPage getComputerPage() {

		computerPage = PageFactory.initElements(driver, ComputerPage.class);
		return computerPage;

	}

	public NewsPage getNewsPage() {

		newsPage = PageFactory.initElements(driver, NewsPage.class);
		return newsPage;
	}

	public AddToWishPage getAddToWishPage() {

		addToWishPage = PageFactory.initElements(driver, AddToWishPage.class);
		return addToWishPage;

	}

	public NewsletterPage getNewsletterPage() {

		newsletterPage = PageFactory.initElements(driver, NewsletterPage.class);
		return newsletterPage;

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
	public CamaraPage getCamaraPage() {

		camaraPage = PageFactory.initElements(driver, CamaraPage.class);
		return camaraPage;
	}

	public static void getAllObjects() {

		allObj = new Initialization();

	}

}

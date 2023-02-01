package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.ApparelPage;
import PageObjects.DigitalDownloadsPage;
import PageObjects.ElectronicPage;
import PageObjects.HomePage;
import PageObjects.JwelryPage;
import PageObjects.JwelryPageFinal;

public class Initialization {

	public static WebDriver driver = new ChromeDriver();
	private static ApparelPage apparelPage;
	private static HomePage homePage;
	private static DigitalDownloadsPage digitalPage;
	private static JwelryPageFinal jwelryPageFinal;
	private static JwelryPage jwelryPage;
	private static ElectronicPage electronicPage;
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

	public JwelryPage getJwelryPage() {

		jwelryPage = PageFactory.initElements(driver, JwelryPage.class);
		return jwelryPage;
	}

	public ElectronicPage getElectronicPage() {

		electronicPage = PageFactory.initElements(driver, ElectronicPage.class);
		return electronicPage;

	}

	public static void getAllObjects() {

		allObj = new Initialization();

	}

}

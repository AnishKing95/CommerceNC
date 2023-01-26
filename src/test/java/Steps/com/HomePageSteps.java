package Steps.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.DigitalDownloadsPage;
import PageObjects.HomePage;
import congifuration.FileConfig;
import io.cucumber.java.en.*;


public class HomePageSteps {
	
	WebDriver driver;
	
	HomePage homePage;
	
	DigitalDownloadsPage digitalPage;
	@Given("user can able enter into home page")
	public void user_can_able_enter_into_home_page() {
	   
		if(FileConfig.property.getProperty("Browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Mainproject 9.30\\CommorceNC\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(FileConfig.property.getProperty("appUrl"));
		driver.manage().window().maximize();
			
		
	}
	
	@Given("user can login with valid credentials")
	public void user_can_login_with_valid_credentials() {
	  
		homePage=PageFactory.initElements(driver, HomePage.class);
		
		WebElement register = homePage.getRegister();
		register.click();
		
		WebElement gender = homePage.getGender();
		gender.click();
		
		WebElement getfName = homePage.getfName();
		getfName.sendKeys("Anish");
		
		WebElement getlName = homePage.getlName();
		getlName.sendKeys("Raja");
		
		WebElement day = homePage.getDay();
		
		WebElement month = homePage.getMonth();
		
		WebElement year = homePage.getYear();
		
		WebElement email = homePage.getEmail();
		email.sendKeys(FileConfig.property.getProperty("username"));
		
		WebElement company = homePage.getCompany();
		company.sendKeys("SkillPits");
		
		WebElement password = homePage.getPassword();
		password.sendKeys(FileConfig.property.getProperty("password"));
		
		WebElement cPassword = homePage.getcPassword();
		cPassword.sendKeys(FileConfig.property.getProperty("password"));
		
		WebElement regBotton = homePage.getRegBotton();
		regBotton.click();
		
		WebElement login = homePage.getLogIn();
		login.click();
		
		WebElement userName = homePage.getUserName();
		userName.sendKeys(FileConfig.property.getProperty("username"));
		
		WebElement passWord = homePage.getPassWord();
		passWord.sendKeys(FileConfig.property.getProperty("password"));
		
		WebElement loginBtn = homePage.getLoginBtn();
		loginBtn.click();
		
		
	
		
	}
	

	
	

}

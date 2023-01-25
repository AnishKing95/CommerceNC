package Steps.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.HomePage;
import congifuration.FileConfig;
import io.cucumber.java.en.*;


public class HomePageSteps {
	
	WebDriver driver;
	
	HomePage homePage;
	
	
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
		WebElement login = homePage.getLogin();
		login.click();
	
		
	}

	
	

}

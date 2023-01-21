package Steps.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import congifuration.FileConfig;
import io.cucumber.java.en.*;


public class HomePageSteps {
	
	WebDriver driver;
	
	
	@Given("user can able enter into home page")
	public void user_can_able_enter_into_home_page() {
	   
		if(FileConfig.property.getProperty("Browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Mainproject 9.30\\CommorceNC\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(FileConfig.property.getProperty("appUrl"));
		driver.manage().window().maximize();
			
		
	}
	
	

}

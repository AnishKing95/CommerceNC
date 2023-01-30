package Steps.com;

import org.openqa.selenium.*;

import Initialization.Initialization;
import congifuration.FileConfig;
import io.cucumber.java.en.*;

public class HomePageSteps extends Initialization {

	@Given("user can able enter into home page")
	public void user_can_able_enter_into_home_page() {

		if (FileConfig.property.getProperty("Browser").equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
//			driver = new ChromeDriver();
		}

		driver.get(FileConfig.property.getProperty("appUrl"));
		driver.manage().window().maximize();

	}

	@Given("user can login with valid credentials")
	public void user_can_login_with_valid_credentials() {

		WebElement register = allObj.getHomePage().getRegister();
		register.click();

		WebElement gender = allObj.getHomePage().getGender();
		gender.click();

		WebElement getfName = allObj.getHomePage().getfName();
		getfName.sendKeys("Anish");

		WebElement getlName = allObj.getHomePage().getlName();
		getlName.sendKeys("Raja");

		WebElement day = allObj.getHomePage().getDay();

		WebElement month = allObj.getHomePage().getMonth();

		WebElement year = allObj.getHomePage().getYear();

		WebElement email = allObj.getHomePage().getEmail();
		email.sendKeys(FileConfig.property.getProperty("username"));

		WebElement company = allObj.getHomePage().getCompany();
		company.sendKeys("SkillPits");

		WebElement password = allObj.getHomePage().getPassword();
		password.sendKeys(FileConfig.property.getProperty("password"));

		WebElement cPassword = allObj.getHomePage().getcPassword();
		cPassword.sendKeys(FileConfig.property.getProperty("password"));

		WebElement regBotton = allObj.getHomePage().getRegBotton();
		regBotton.click();

		WebElement login = allObj.getHomePage().getLogIn();
		login.click();

		WebElement userName = allObj.getHomePage().getUserName();
		userName.sendKeys(FileConfig.property.getProperty("username"));

		WebElement passWord = allObj.getHomePage().getPassWord();
		passWord.sendKeys(FileConfig.property.getProperty("password"));

		WebElement loginBtn = allObj.getHomePage().getLoginBtn();
		loginBtn.click();

	}

}

package com.runner.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import congifuration.FileConfig;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\Resouces\\sample.feature" },
                 glue = { "Steps.com" },
                 plugin = {"json:target/cucumber.json" , "pretty", "html:target/cucumber-reports"},
                 monochrome = true
		

)

public class runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		FileConfig.fileReader();
		driver = new ChromeDriver();

	}

	@AfterClass
	public static void tearDown() {

		driver.quit();

	}

}

package com.runner.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Initialization.Initialization;
import congifuration.FileConfig;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Features\\sample.feature" },
                 glue = { "Steps.com" },
                 plugin = { 
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true,
                 publish=true
		

)

public class runner extends Initialization {


	@BeforeClass
	public static void setup() {

		FileConfig.fileReader();
		Initialization.getAllObjects();
		

	}

	@AfterClass
	public static void tearDown() {

		driver.quit();

	}

}

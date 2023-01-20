package com.runner.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features= {"\\src\\test\\java\\Resouces\\sample.feature"},
                  glue = {"Steps.com"},
                  plugin = {"json:target/cucumber.json"}
	
		)

public class runner {
	
	

}

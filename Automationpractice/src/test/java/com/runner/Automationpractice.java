package com.runner;




import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/Automationpractice.feature"},
		glue = {"com.stepdef"},
		plugin = {"pretty", "html:target" , "json:target/cucumber.json" , 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}, 
		monochrome = true
		
		
		
		
		)


public class Automationpractice extends AbstractTestNGCucumberTests   {

}



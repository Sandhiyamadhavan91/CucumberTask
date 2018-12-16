package com.cucu.runnertask;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\cucu\\feature\\Amazon.feature", glue ="com.cucu.stepdeftask",plugin= {"pretty","html:Reports","junit:Reports/cucumber.xml","json:Reports/cucumber.json"} )

public class TestRunner {
	
		
}


package com.danjerous.framework.cucumber;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {
}

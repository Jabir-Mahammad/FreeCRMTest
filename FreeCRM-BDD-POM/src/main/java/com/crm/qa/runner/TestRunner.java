package com.crm.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\SeleniumWorkspace\\FreeCRM-BDD-POM\\src\\main\\java\\com\\crm\\qa\\features\\loginValidation.feature"
		,glue= {"com/crm/qa/stepDefinition"}
		,format= {"pretty","html:test-output"}
		,dryRun=false
		//,tags = {"@SmokeTest","@RegressionTest"}		
		, strict = true 		
		,monochrome =  true
		)
		
		
public class TestRunner {

}

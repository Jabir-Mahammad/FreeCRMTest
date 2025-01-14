package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\SeleniumWorkspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\deals.feature"
		,glue= {"stepDefinitions"}
		,format= {"pretty","html:test-output"}
		,dryRun=false
		//,tags = {"@SmokeTest","@RegressionTest"}		
		, strict = true 		
		,monochrome =  true
		)

public class TestRunner {

}

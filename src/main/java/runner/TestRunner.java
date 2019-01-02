package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="/Users/gvijaykumarreddy/Desktop/Selenium Practice/FreeCRMBDDFramework/src/main/java/Feature/taggedhooks.feature"
	,glue={"stepDefinition"}
	,monochrome=true //displays the output readable in console
	,dryRun=false //
	,strict=true //
	,format={"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"}
	//,tags={"@End2End, @RegressionTest, ~@SmokeTest"}
)

public class TestRunner {

}

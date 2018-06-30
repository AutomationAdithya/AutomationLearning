package Runner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

//@RunWith(Cucumber.class)				
//@CucumberOptions (features="C:\\Users\\Adithya\\eclipse-workspace\\CUCUMBER_MAVEN\\src\\main\\java\\features\\LoginCredentialsandreset.feature",
//glue={"StepDefinition"},
//dryRun = false)
//
//
//public class Runner 				
//{		
//
//}

@RunWith(Cucumber.class)
@CucumberOptions(
		//The path of the feature file
		features = "C:\\Users\\Adithya\\eclipse-workspace\\CUCUMBER_MAVEN\\src\\main\\java\\features\\LoginCredentials.feature",
		glue = {"StepDefinitions"},// The path of the step definition files
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},// to generate different types of reports
		monochrome=true, // It will check any step is not definied in the step definition file
		dryRun = false // to check the mapping is proper between feature file and step definition file
		//tags= {"@SmokeTest"}
		
		)
public class Runner {

}

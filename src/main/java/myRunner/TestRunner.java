package myRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\saadi\\eclipse-workspace\\seleniumAutomation\\CucumberBDDFramework\\src\\main\\java\\Features\\dataDrivenTableMap.feature", 
		//the path of the feature file
        //we can use the path of feature file or just name of package contains the feature file(path better)
		glue= {"stepDefinition"},//the path of the step definition file
		format= {"pretty", "html:test-output", "json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},// to generate different type of reporting 
		monochrome = true, //display the console out put in a proper readable format
		strict = false,// it will check if any step is not defined inside the step definition file  
		dryRun = false // to check the mapping is correct between the feature file and the step definition file
		//tags = {"@SmokeTest"}// select specific scenario(with that annotation ex: @smokeTest) to run.
		                       //OR we use comma between annotation to run this or that scenario.
		                       //AND we use double cot and comma between annotation to this and that scenario. 
		                       //ignore scenario we use ~ in front of that specific annotation ex "~@SmokeTest"
		)

public class TestRunner {

}


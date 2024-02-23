package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\SpringTool\\Govtsite-Assesment\\src\\test\\resources\\form\\Govt.feature",glue = "stepdefination")
public class runnerfile extends AbstractTestNGCucumberTests {

}

package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//Features/Login.feature", 
		glue="Stepdefinition" ,
		dryRun=false , 
		monochrome=true, 
		plugin= {"pretty"})

public class RunLogin {

}

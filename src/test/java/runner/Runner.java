package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features"},
		glue = {"step_Definitions"},
		tags = "@Smoke",
		monochrome = true,
		//dryRun = true,
		dryRun = false,
		plugin = {"pretty","html:test-output"}		
)
public class Runner {

}//class

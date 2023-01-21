package adactin.com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\src\\test\\java\\adactin\\com\\features", glue = "adactin.com.stepdefinition")

public class Runner {

}

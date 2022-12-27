package testrunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
				features="src/test/java/features",
				glue="stepdefiniton",plugin = {"json:target/cucumber.json"})
public class Testrunner  {

}
//extends AbstractTestNGCucumberTests









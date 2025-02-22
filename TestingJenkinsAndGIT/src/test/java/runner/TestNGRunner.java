package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefs",
plugin = {"pretty", "html:target/site/cucumber.html","json:target/site/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

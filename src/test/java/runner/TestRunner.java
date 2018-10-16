package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Karthik on 10/26/2016.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"},
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {

}

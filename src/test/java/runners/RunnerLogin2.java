package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import utils.Driver;

@CucumberOptions(
        features = {"src/test/java/features/login2.feature"},
        glue = {"stepdefs"}
)
public class RunnerLogin2 extends AbstractTestNGCucumberTests {

}

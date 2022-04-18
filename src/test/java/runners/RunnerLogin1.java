package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features/login1.feature"},
        glue = {"stepdefs"}
)
public class RunnerLogin1 extends AbstractTestNGCucumberTests {


}

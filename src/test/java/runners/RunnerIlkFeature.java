package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features/feature1.feature"},
        glue = {"stepdefs"},
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "summary"}
)

public class RunnerIlkFeature extends AbstractTestNGCucumberTests {


}

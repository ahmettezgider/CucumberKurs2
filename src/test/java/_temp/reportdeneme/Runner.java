package _temp.reportdeneme;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/_temp/reportdeneme/reportfeature.feature"},
        glue = {"_temp/reportdeneme"},
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "summary"}


)
public class Runner extends AbstractTestNGCucumberTests {

}

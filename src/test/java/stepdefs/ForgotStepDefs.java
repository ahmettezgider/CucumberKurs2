package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ForgotPage;
import utils.ParentClass;

public class ForgotStepDefs {

    ForgotPage forgotPage = new ForgotPage();

    @Given("user is at Login Page")
    public void userIsAtLoginPage() {
    forgotPage.gotoLoginPage("https://opencart.abstracta.us/index.php?route=account/login");
    }

    @When("user clicks to forgot password")
    public void userClicksToForgotPassword() {
        forgotPage.eForgotPassButton.click();
    }

    @Then("user enters an valid email")
    public void userEntersAnValidEmail() {
        forgotPage.eEmailAddress.sendKeys("ZeydinToprak@hotmail.com");

    }

    @And("user clicks on continue button")
    public void userClicksOnContinueButton() {
        forgotPage.eContinueButton.click();
    }

    @And("user checks text for confirmation email")
    public void userChecksTextForConfirmationEmail() {
        Assert.assertTrue(forgotPage.eSuccessText.getText().contains("confirmation link"));
    }
}

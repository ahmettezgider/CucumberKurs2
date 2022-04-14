package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ForgotPassPage;

import java.util.List;
import java.util.Map;

public class ForgotPassStepdefs {

    ForgotPassPage forgotPage= new ForgotPassPage();

    @Given("user is at Login Page")
    public void userIsAtLoginPage() {
        forgotPage.gotoLoginPage(forgotPage.url);
    }

    @When("user clicks to forgot password")
    public void userClicksToForgotPassword() {
        forgotPage.eForgotPassButton.click();
    }

    @Then("user enters an valid email")
    public void userEntersAnValidEmail() {
        forgotPage.eForgotEmailAddress.sendKeys(forgotPage.email);
    }

    @And("user clicks on continue button")
    public void userClicksOnContinueButton() {
        forgotPage.eForgotContinueButton.click();
    }

    @And("user checks text for confirmation email")
    public void userChecksTextForConfirmationEmail() {
        Assert.assertTrue(forgotPage.eForgotSuccessText.getText().contains("confirmation link"));
        System.out.println(forgotPage.eForgotSuccessText.getCssValue("background-color"));
        //  String back_color="#dff0d8";
        //    Assert.assertEquals(back_color, forgotPage.eSuccessText.getCssValue("background-color"));
    }


    @When("user enters email and password")
    public void userEntersEmailAndPassword(DataTable table) throws InterruptedException {
        List<Map<String,String>> maps = table.asMaps();

        for (Map<String, String> map : maps) {

            forgotPage.eEmail.clear();
            forgotPage.eEmail.sendKeys(map.get("email"));

            forgotPage.ePassword.clear();
            forgotPage.ePassword.sendKeys(map.get("password"));

            forgotPage.eLoginButton.click();

            if (map.get("status").equals("0")){

                Assert.assertTrue(forgotPage.eFailedLogin.getText().contains("Warning"));
            } else {
                Assert.assertEquals(forgotPage.eSuccessfulLogin.getText(), "Edit Account");
            }

        }

    }
}

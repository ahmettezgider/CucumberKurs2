package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.LoginPO;


public class loginStepDef {
    LoginPO po = new LoginPO();

    @Given("user  on homepage")
    public void userOnHomepage() {
        po.gotoSite();
    }

    @And("user clicks to My Account")
    public void userClicksToMyAccount() {
        po.clickTo(po.myAccount);
    }

    @And("user clicks to login")
    public void userClicksToLogin() {
        po.clickTo(po.loginLink);
    }


    @When("writes user {string} and {string}")
    public void writesUserAnd(String username, String password) {
        po.filltheForm(username, password);
    }

    @And("user clicks to loginButton")
    public void userClicksToLoginButton() {
        po.clickTo(po.loginSubmitButton);
    }


    @Then("should act according to {string}")
    public void shouldActAccordingTo(String status) {
        if (status.equalsIgnoreCase("true")) {
            po.logout.click();
        } else if (status.equalsIgnoreCase("false")) {
            Assert.assertTrue(po.AlertDanger.getText().contains("Warning:"));

        }
    }

    @When("user clicks to ForgottenPassword")
    public void userClicksToForgottenPassword() {
        po.clickTo(po.eForgottenPassword);

    }

    @Then("User should be taken to Forgotten Password page")
    public void userShouldBeTakenToForgottenPasswordPage() {

        Assert.assertTrue(po.ePageForgottenPassword.getText().contains("Forgotten Password"));

    }

    @When("user Tab to email and writes {string}")
    public void userTabToEmailAndWrites(String email) {
        for (int i = 0; i < 22; i++) {
            po.actions().sendKeys(Keys.TAB).pause(100).build().perform();

            if (i == 21) {
                po.actions().sendKeys(Keys.TAB + email).build().perform();
            }

        }

    }

    @And("user Tab to password and writes {string}")
    public void userTabToPasswordAndWrites(String password) {

        po.actions().sendKeys(Keys.TAB + password).build().perform();


    }

    @And("user clicks login button with enter")
    public void userClicksLoginButtonWithEnter() {
        po.actions().sendKeys(Keys.ENTER).build().perform();

    }


    @Then("user should see logout")
    public void userShouldSeeLogoutButton() {
        Assert.assertTrue(po.logout.isDisplayed());
    }

    @And("user clicks to logoutButton")
    public void userClicksToLogoutButton() {
        po.logout.click();
    }


    @Then("User should not logged out")
    public void userShouldNotLoggedOut() {
        po.myAccount.click();
        Assert.assertEquals(po.eMyAccontlist.size(), 5);
        po.eMyAccontlist.get(4).click();


    }


    @And("user clicks to browser backButton")
    public void userClicksToBrowserBackButton() {
        po.driverNavigate();
    }


    @And("user click to browser back button")
    public void userClickToBrowserBackButton() {
        po.driverNavigate();
    }


    @When("user is in login")
    public void userIsInLogin() {
        writesUserAnd("testngkurs@gmail.com", "testngkurs");
        userClicksToLoginButton();
    }


    @Then("user should see {string}")
    public void userShouldSee(String text) {
        Assert.assertTrue(po.AlertDanger.getText().contains(text));
    }



    @When("user repeats login five times with wrong {string} and {string}")
    public void userRepeatsLoginFourTimesWithWrongAnd(String email, String password) {
        for (int i = 0; i < 5; i++) {
            po.sendKeysTo(po.usernameInput, email);
            po.sendKeysTo(po.passwordInput, password);
            po.clickTo(po.loginSubmitButton);
        }
    }
}



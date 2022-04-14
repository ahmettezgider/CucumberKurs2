package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPO;


public class LoginStepDef {

        LoginPO po = new LoginPO();

        @Given("user  on homepage")
        public void userOnHomePage() {
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
        public void writesUserAnd(String email, String password) {
            po.filltheForm(email, password);
        }

        @And("user clicks to loginButton")
        public void userClicksToLoginButton(){
            po.clickTo(po.loginSubmitButton);
        }

        @Then("should be displayed logout")
        public void shouldBeDisplayedLogout() {
            po.wait(po.logout);
        }


        @Then("should be displayed {string}")
        public void shouldBeDisplayed(String text) {
            Assert.assertEquals(po.AlertDanger.getText(),text);
        }


    }


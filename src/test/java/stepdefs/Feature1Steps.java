package stepdefs;

import io.cucumber.java.en.*;
import org.testng.Assert;


public class Feature1Steps {

    String str = "a";

    @Then("login form should be visible test")
    public void loginFormShouldBeVisible1() {
        System.out.println("login form should be visible");
    }

    @When("user clicks to login button test")
    public void userClicksToLoginButton() {
        System.out.println("user set str as \"a\"");
    }

    @Given("user on home page test")
    public void userOnHomePage() {
        System.out.println("user on home page");
    }

    @Given("user goes to login form test")
    public void userGoesToLoginForm() {
        System.out.println("user goes to login form");
    }

    @When("user input username test")
    public void userInputUsername() {
        System.out.println("user input username");
    }

    @But("user input password test")
    public void userInputPassword() {
        System.out.println("user input password");
    }

    @Then("page title should be My Account test")
    public void pageTitleShouldBeMyAccount() {
        System.out.println("page title should be My Account");
        Assert.fail();
    }

    @And("My Account page should be visible test")
    public void myAccountPageShouldBeVisible() {
        System.out.println("");
    }
}

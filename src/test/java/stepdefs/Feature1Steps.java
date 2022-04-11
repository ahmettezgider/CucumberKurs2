package stepdefs;

import io.cucumber.java.en.*;


public class Feature1Steps {

    String str = "a";

    @Then("login form should be visible")
    public void loginFormShouldBeVisible1() {
        System.out.println("login form should be visible");
    }

    @When("user clicks to login button")
    public void userClicksToLoginButton() {
        System.out.println("user set str as \"a\"");
    }

    @Given("user on home page")
    public void userOnHomePage() {
        System.out.println("user on home page");
    }

    @Given("user goes to login form")
    public void userGoesToLoginForm() {
        System.out.println("user goes to login form");
    }

    @When("user input username")
    public void userInputUsername() {
        System.out.println("user input username");
    }

    @But("user input password")
    public void userInputPassword() {
        System.out.println("user input password");
    }

    @Then("page title should be My Account")
    public void pageTitleShouldBeMyAccount() {
        System.out.println("page title should be My Account");
    }

    @And("My Account page should be visible")
    public void myAccountPageShouldBeVisible() {
        System.out.println("");
    }
}

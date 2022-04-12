package _temp.hooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {
    @Given("given step")
    public void givenStep() {
        System.out.println("Given");
    }

    @When("when step")
    public void whenStep() {
        System.out.println("When");
    }

    @Then("then step")
    public void thenStep() {
        System.out.println("Then");
    }
}

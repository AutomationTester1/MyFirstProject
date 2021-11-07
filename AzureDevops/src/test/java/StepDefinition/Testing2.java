package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testing2 {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("Precondition is passed");
	}


	@When("I complete action")
	public void i_complete_action() {
	    System.out.println("When condirion is passed");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    System.out.println("Then condition is passed");
}
}

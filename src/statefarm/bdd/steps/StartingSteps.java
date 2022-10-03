package statefarm.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import statefarm.bdd.base.BaseClass;

public class StartingSteps extends BaseClass {

	@Given("user is in the homepage")
	public void user_is_in_the_homepage() {
		homePage.getCurrentUrl();

	}

	@When("user input {int} in zipcode")
	public void user_input_in_zipcode(Integer int1) {
		homePage.inputZipCode(int1.toString());

	}
	
	

	

}

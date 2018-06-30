package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/////////  Before hook method is the first one to be executed 
///// The other methods will be executed in the middle
///// After hook will be the last one to be executed
public class hooks {
	/*@Before
	public void before() {
		System.out.println("This is before Hook");
	}
	@After
	public void after() {
		System.out.println("This is After Hook");
	}*/
	@Given("^Zero is available$")
	public void zero_is_available() {
		System.out.println("This is Zero");
	}

	@When("^first is available$")
	public void first_is_available() {
	   System.out.println("This is first");
	}

	@Then("^second is available$")
	public void second_is_available()  {
		System.out.println("This is second");
	}

	@Then("^third is available$")
	public void third_is_available()  {
		System.out.println("This is Third");
	}

	@Then("^fourth is available$")
	public void fourth_is_available()  {
		System.out.println("This is fourth");
	}




}

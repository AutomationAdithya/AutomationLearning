package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tagged_Hooks {
	
	@Before
	public void TaggedHooksLerningBefore() {
		System.out.println("Tagged Hooks Before");
	}
	@After
	public void TaggedHooksLerningAfter() {
		System.out.println("Tagged Hooks After");
	}
	@Before("@First")
	public void TaggedHooksLerningBeforeFirst() {
		System.out.println("Tagged Hooks Before@First");
	}
	@After("@First")
	public void TaggedHooksLerningAfterFirst() {
		System.out.println("Tagged Hooks After@First");
	}
	@Given("^sevenone is available$")
	public void sevenone_is_available()  {
	   System.out.println("This is seven one");
	}

	@When("^seventwo is available$")
	public void seventwo_is_available() {
		System.out.println("This is seven two");
	}

	@Then("^seventhree is available$")
	public void seventhree_is_available()  {
		System.out.println("This is seven three");
	}

	@Given("^eightone is available$")
	public void eightone_is_available() {
		System.out.println("This is eight one");
	}

	@When("^eighttwo is available$")
	public void eighttwo_is_available()  {
		System.out.println("This is eight two");
	}

	@Then("^eightthree is available$")
	public void eightthree_is_available()  {
		System.out.println("This is eight three");
	}

	@Given("^nineone is available$")
	public void nineone_is_available()  {
		System.out.println("This is nine one");
	}

	@When("^ninetwo is available$")
	public void ninetwo_is_available() {
		System.out.println("This is nine two");
	}

	@Then("^ninethree is available$")
	public void ninethree_is_available() {
		System.out.println("This is nine three");
	}

}
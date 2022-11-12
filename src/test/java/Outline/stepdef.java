package Outline;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
   @Given("^User is on Welcome Page$")
   public void user_on_welcome_page() {
      System.out.println("User on welcome page");
   }
   @Then("Welcome page should be displayed")
   public void welcome_page_should_be_displayed() {
       // Write code here that turns the phrase above into concrete actions
	   System.out.println("Thara");
   }
   @When("I enter Username as {string} and Password as {string}")
   public void i_enter_Username_as_and_Password_as(String string1, String string2) {
       // Write code here that turns the phrase above into concrete actions
       System.out.println("username"+string1+"pwd"+string2);
   }
   @When("^I enterr Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
   public void I_enter_Username_as_and_Password_ass(String arg1, String arg2) {
      System.out.println("Success"); 
   }
   @Before public void cleanUpa(){ 
	      System.out.println("before triggerd");
	   } 
   @After public void cleanUp(){ 
      System.out.println("after triggered");
   } 
   @Given("I want to write a step with name{int}")
   public void i_want_to_write_a_step_with_name(Integer int1) {
       // Write code here that turns the phrase above into concrete actions
System.out.println("int value is"+int1);
   }

   @When("I check for the {int} in step")
   public void i_check_for_the_in_step(Integer int1) {
       // Write code here that turns the phrase above into concrete actions
	   System.out.println("int value is step"+int1);
   }

   @Then("I verify the success in step")
   public void i_verify_the_success_in_step() {
       // Write code here that turns the phrase above into concrete actions
	   System.out.println("Verified");
   }

   @Then("I verify the Fail in step")
   public void i_verify_the_Fail_in_step() {
       // Write code here that turns the phrase above into concrete actions
	   System.out.println("Verified fail");
   }

}
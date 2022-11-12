package Stepdef;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
   @Given("^User is on Welcome Page$")
   public void user_on_welcome_page() {
      System.out.println("User on welcome page");
   }
   @Then("^Welcome page should be displayed$")
   public void welcome_page_should_be_displayed() {
      System.out.println("User should be on welcome page");
   }
   @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
      System.out.println("entered user name and passwrod is"+arg1 +arg2);
   } 

}
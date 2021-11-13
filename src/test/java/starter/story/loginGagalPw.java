package starter.story;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginGagalPw {
    @Given("I am on the Login Page failed password")
    public void i_am_on_the_Login_Page_failed_password() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        System.out.println("Gagal");

    }

    @When("I enter my username correctly and password wrong")
    public void i_enter_my_username_and_password_correctly_and_password_wrong() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("I click 'Login' button for failed")
    public void i_click_button_for_failed() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("I am taken to the dashboard failed")
    public void i_am_taken_to_the_dashboard_failed() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }
}

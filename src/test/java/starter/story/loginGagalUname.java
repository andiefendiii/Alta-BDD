package starter.story;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginGagalUname {
    @Given("I am on the Login Page failed username")
    public void i_am_on_the_Login_Page_failed_username() {
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();
        System.out.println("Gagal");

    }

    @When("I enter my username wrong and password correctly")
    public void i_enter_my_username_wrong_and_password_correctly() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("I click 'Login' button for failed case")
    public void i_click_button_for_failed_case() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("I am taken to the dashboard failed login")
    public void i_am_taken_to_the_dashboard_failed_login() {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }
}

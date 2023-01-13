package com.qascript.StepDefs;

import com.qascript.BaseClass;
import com.qascript.PageObjects.HomePage;
import com.qascript.PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefs  {

    @Given("user enters valid username in the username field")
    public void userEntersValidUsernameInTheUsernameField() {
        LoginPage.enterUsername("patebij@gmail.com");
    }
    @And("user enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        LoginPage.enterPassword("test@123");
    }
    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickLogin();
    }
    @Then("user is logged in Successfully")
    public void userIsLoggedInSuccessfully() {
        HomePage.validateText("My Account");

    }
    @Given("^user enters invalid (.*) in the username field$")
    public void userEntersInvalidUsernameInTheUsernameField(String username) {
        LoginPage.enterUsername(username);
    }
    @And("^user enters invalid (.*) in the password field$")
    public void userEntersInvalidPasswordInThePasswordField(String password) {
        LoginPage.enterPassword(password);
    }
    @Then("^error (.*) is displayed$")
    public void errorMessageIsDisplayed(String Error_message) {
        LoginPage.validateInvalidLogin(Error_message);

    }
}

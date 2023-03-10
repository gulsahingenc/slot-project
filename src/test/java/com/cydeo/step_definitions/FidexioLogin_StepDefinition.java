package com.cydeo.step_definitions;

import com.cydeo.pages.FidexioLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FidexioLogin_StepDefinition {

    FidexioLoginPage fidexioLoginPage = new FidexioLoginPage();
    @Given("user is on fidexio log in page")
    public void user_is_on_fidexio_log_in_page() {
        Driver.getDriver().get("https://qa.fidexio.com/");
    }

    @When("user enter salesmanager username {string}")
    public void user_enter_salesmanager_username(String string) {

        fidexioLoginPage.userName.sendKeys(string);

    }


    @When("user enter salesmanager password {string}")
    public void user_enter_salesmanager_password(String string) {
        fidexioLoginPage.password.sendKeys(string);

    }

    @When("click Log in button")
    public void click_log_in_button() {

        fidexioLoginPage.logInButton.click();
    }

    @Then("user\\(salesmanager) should be on the dashboard")
    public void user_salesmanager_should_be_on_the_dashboard() {

        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("var",expectedTitle, actualTitle);
    }

    @When("user enter posmanager username {string}")
    public void user_enter_posmanager_username(String string) {

    }
    @When("user enters posmanager password {string}")
    public void user_enters_posmanager_password(String string) {

    }

    @Then("user\\(posmanager) should be on the dashboard")
    public void user_posmanager_should_be_on_the_dashboard() {

    }


    @When("user enter {string} and {string}")
    public void user_enter_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("{string} should be displayed")
    public void should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enter {string} or {string}")
    public void user_enter_or(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click {string} link")
    public void user_click_link(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user on the {string} page")
    public void user_on_the_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user enters password")
    public void user_enters_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should see the password displayed in bullet signs")
    public void user_should_see_the_password_displayed_in_bullet_signs() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user enter salesmanager8@info.com into the email field")
    public void user_enter_salesmanager8_info_com_into_the_email_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enter salesmanager into the password field")
    public void user_enter_salesmanager_into_the_password_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enter {string} key of the keyboard")
    public void user_enter_key_of_the_keyboard(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be on the login page")
    public void user_should_be_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}



package com.cydeo.step_definitions;

import com.cydeo.pages.Day18_WebTableApp;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class Day18_WebTablesPractice_StepDefs {

    Day18_WebTableApp day18_webTableApp = new Day18_WebTableApp();

    @Given("user should be in main web table login page")
    public void user_should_be_in_main_web_table_login_page() {
//        Driver.getDriver(ConfigurationReader.getProperty("env")).get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters tester username")
    public void user_enters_tester_username() {
        day18_webTableApp.usernameInputBox.sendKeys("Test");
    }

    @When("user enters tester password")
    public void user_enters_tester_password() {
        day18_webTableApp.passwordInputBox.sendKeys("Tester");
        day18_webTableApp.loginButton.click();
    }

    @Then("user should see url ending with orders")
    public void user_should_see_url_ending_with_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }


    @When("user enters username {string} Password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
//    day18_webTableApp.usernameInputBox.sendKeys(username);
//    day18_webTableApp.passwordInputBox.sendKeys(password);
//    day18_webTableApp.loginButton.click();

        day18_webTableApp.login(username,password);

    }

    @Then("user should see url contains order")
    public void userShouldSeeUrlContainsOrder() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("order"));

    }


    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String , String> credentials) {

//        day18_webTableApp.usernameInputBox.sendKeys(credentials.get("username"));
//        day18_webTableApp.passwordInputBox.sendKeys(credentials.get("Password"));
//        day18_webTableApp.loginButton.click();

        day18_webTableApp.login(credentials.get("username"),credentials.get("Password"));

    }
}

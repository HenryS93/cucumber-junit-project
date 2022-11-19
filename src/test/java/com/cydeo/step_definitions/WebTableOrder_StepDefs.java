package com.cydeo.step_definitions;

import com.cydeo.pages.Day18_WebTableApp;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableOrder_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDefs {

    Day18_WebTableApp day18_webTableApp = new Day18_WebTableApp();
    WebTableOrder_Page webTableOrder_page = new WebTableOrder_Page();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        day18_webTableApp.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("Password"));
        webTableOrder_page.orderNavItemButton.click();

    }


    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        Select select = new Select(webTableOrder_page.selectByProductDropdown);
        select.selectByVisibleText(string);

    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {

        webTableOrder_page.quantityInputBox.clear();
        webTableOrder_page.quantityInputBox.sendKeys(int1+"");


    }



    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {

        webTableOrder_page.customerNameInputBox.sendKeys(string);

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {

        webTableOrder_page.streetInputBox.sendKeys(string);

    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {

        webTableOrder_page.cityInputBox.sendKeys(string);

    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {

        webTableOrder_page.stateInputBox.sendKeys(string);

    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {

        webTableOrder_page.zipcodeInputBox.sendKeys(string);

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {

//        for (WebElement eachCard : webTableOrder_page.cardTypeRadioButton){
//
//            if (eachCard.getAttribute("value").equalsIgnoreCase(string)){
//                eachCard.click();
//            }
//            }

        BrowserUtils.clickRadioButton(webTableOrder_page.cardTypeRadioButton, string);

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

        webTableOrder_page.cardNumberInputBox.sendKeys(string);

    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {

    webTableOrder_page.cardExpDateInputBox.sendKeys(string);

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {

        webTableOrder_page.processOrderButton.click();

    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedCustomerName) {

        String actualCustomerName = viewAllOrdersPage.newCustomerCell.getText();
        Assert.assertEquals("Check your code! Error", expectedCustomerName, actualCustomerName);


    }
}

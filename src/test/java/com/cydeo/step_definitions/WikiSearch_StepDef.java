package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch_StepDef {

WikiSearchPage wikiSearchPage = new WikiSearchPage();


    @Given("user should be in the Wikipedia home page")
    public void user_should_be_in_the_wikipedia_home_page() {
        Driver.getDriver().navigate().to("https://www.wikipedia.org/");

    }


    @When("user types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
    wikiSearchPage.wikiInputSearchBox.sendKeys("Steve Jobs");

    }


    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
    wikiSearchPage.searchButton.click();

    }


    @Then("user sees Steve Jobs is in wiki title")
    public void user_sees_steve_jobs_is_in_wiki_title() {

        Assert.assertTrue("Title Verification FAILED!",Driver.getDriver().getTitle().contains("Steve Jobs"));

    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchKeyword) {

        wikiSearchPage.wikiInputSearchBox.sendKeys(searchKeyword);

    }
    @Then("user sees {string} is in wiki title")
    public void user_sees_is_in_wiki_title(String string) {

        Assert.assertTrue("Title verification FAILED!",Driver.getDriver().getTitle().contains(string));

    }



}

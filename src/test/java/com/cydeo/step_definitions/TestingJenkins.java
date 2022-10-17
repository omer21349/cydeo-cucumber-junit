package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchFunctionality;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TestingJenkins {
    GoogleSearchFunctionality goggle= new GoogleSearchFunctionality();
    @Given("As a user open google search page")
    public void as_a_user_open_google_search_page() {
        //Driver.getDriver().get("https://www.google.com");
    }
    @Given("As a user enter a {string}")
    public void as_a_user_enter_a(String string) {
        //goggle.searchPlace.sendKeys(string);
    }
    @Given("Click search button.")
    public void click_search_button() {
        //goggle.searchButton.click();
    }
    @Then("Verify title is {string}")
    public void verify_title_is(String string) {
      //  Assert.assertEquals(Driver.getDriver().getTitle(),string);
    }
}

package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WikiSearchStepDefinitions {
    WikipediaPages wikipediaPages= new WikipediaPages();
   // WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    @When("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://wikipedia.com");

    }
    @When("User types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String name) {
        wikipediaPages.searchPlace.sendKeys(name);

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaPages.searchButtonClick.click();

    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title(String name) {
        //wait.until(ExpectedConditions.titleIs(name+" - Wikipedia"));
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=name+" - Wikipedia";
        Assert.assertEquals(expectedTitle,actualTitle);
       // Assert.assertEquals(name,wikipediaPages.imageName.getText());

    }


    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String mainHeader) {
        Assert.assertEquals(mainHeader,wikipediaPages.pageTitle.getText());
    }
}
/*
TC#2: Wikipedia Search Functionality Title Verification
1. User is on Wikipedia home page
2. User types Steve Jobs in the wiki search box
3. User clicks wiki search button
4. User sees Steve Jobs is in the wiki title
Note: Follow POM
 */
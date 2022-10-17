package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class WindowHandleStepDefinition {

    @Given("As a user go to practice page")
    public void as_a_user_go_to_practice_page() {
        Driver.getDriver().get("https://practice.cydeo.com/windows");
    }
    @When("Assert title is window")
    public void assert_title_is_window() {
       String actualTitle= Driver.getDriver().getTitle();
       String expectedTitle="Windows";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @When("Click {string} link")
    public void click(String string) {
        Driver.getDriver().findElement(By.linkText(string)).click();
    }
    @When("Switch to {string}")
    public void switch_to_new_window(String newWindow) {
        Set<String> windows=Driver.getDriver().getWindowHandles();

        for (String window : windows) {
           Driver.getDriver().switchTo().window(window);
            if(Driver.getDriver().getTitle().equals(newWindow)) {
                break;
            }
        }
    }
    @When("Assert title is {string}")
    public void assert_title_is_new_window(String expectedTitle) {
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }

}

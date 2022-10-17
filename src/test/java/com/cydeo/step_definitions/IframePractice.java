package com.cydeo.step_definitions;

import com.cydeo.pages.IframePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class IframePractice {

    IframePage iframePage=new IframePage();
    @When("As a user open the Cydeo practice page")
    public void test1(){
        Driver.getDriver().get("https://practice.cydeo.com/iframe");
    }
    @And("Verify Your content goes here is displayed")
    public void test2(){
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("mce_0_ifr")));
        System.out.println(Driver.getDriver().findElement(By.tagName("p")).getText());
    }
    @Then("Verify Iframe contain the TinyMCE WYSIWYG Editor")
    public void test3(){
        Driver.getDriver().switchTo().parentFrame();
        Assert.assertTrue(iframePage.content.isDisplayed());

    }



}

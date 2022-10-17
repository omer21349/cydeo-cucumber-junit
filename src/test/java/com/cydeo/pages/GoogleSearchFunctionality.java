package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchFunctionality {

    public GoogleSearchFunctionality(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "q")
    public WebElement searchPlace;
    @FindBy(xpath = "(//input[@class='gNO89b'])[2]")
    public WebElement searchButton;


//ul[@data-testid='mini-nav']

}
/*
TC#1: Google Search Functionality Title Verification
1. User is on Google search page
2. User types apple in the google search box and clicks enter
3. User sees Steve Jobs is in the google title
Note: Follow POM
 */
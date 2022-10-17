package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPages {

    public WikipediaPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "searchInput")
    public WebElement searchPlace;

    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchButtonClick;

    @FindBy(id = "firstHeading")// if you use . or text() its same thing //h1[text()='Steve Jobs']
    public WebElement pageTitle;

//    @FindBy(css = "caption[class='infobox-title fn']")
//    public WebElement imageName;



}
/*TC#2: Wikipedia Search Functionality Title Verification
        1. User is on Wikipedia home page
        2. User types Steve Jobs in the wiki search box
        3. User clicks wiki search button
        4. User sees Steve Jobs is in the wiki title
        Note: Follow POM


 */
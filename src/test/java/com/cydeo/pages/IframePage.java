package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePage {
    public IframePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(tagName="h3")
    public WebElement content;


}

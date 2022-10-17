package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrderPages {

    public ViewAllOrderPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//tbody//tr//td)[1]")
    public WebElement orderFirstPlace;


}

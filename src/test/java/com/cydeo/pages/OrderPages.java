package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPages extends BasePages{

    public OrderPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(name = "product")
    public WebElement productDropdown;
    @FindBy (name="quantity")
    public WebElement quantity;

    @FindBy (xpath = "//input[@placeholder='Enter the price for an individual unit']")
    public WebElement pricePerUnit;

    @FindBy (xpath = "//input[contains(@placeholder,'Enter the discount')]")
    public WebElement discount;
    @FindBy (xpath = "(//label[.='Total'])/..//div//input")
    public WebElement totalNum;
    @FindBy (xpath = "//button[.='Calculate']")
    public WebElement calculate;

    @FindBy (name="name")
    public WebElement costumerName;

    @FindBy (name="street")
    public WebElement street;

    @FindBy (name="city")
    public WebElement city;

    @FindBy (name="state")
    public WebElement state;

    @FindBy (name="zip")
    public WebElement zip;

    @FindBy (xpath = "//label[.='Visa']")
    public WebElement visa;

    @FindBy (xpath = "//label[.='MasterCard']")
    public WebElement masterCard;

    @FindBy (xpath = "//label[.='American Express']")
    public WebElement americanExpress;

    @FindBy (name="cardNo")
    public WebElement cardNo;

    @FindBy (name="cardExp")
    public WebElement cardExp;

    @FindBy (xpath = "//button[text()='Process Order']")
    public WebElement processOrder;

    @FindBy (xpath = "//button[text()='Reset Fields']")
    public WebElement resetFields;


   /* public WebElement cardType(String name){
        name=name.toLowerCase();
        WebElement result = null;
        switch (name){
            case "visa":
               result=visa;
               break;
            case "american express":
                result=americanExpress;
                break;
            case "master card":
                result=masterCard;
                break;
        }return result;
    }*/

    @FindBy(name = "card")
    public List<WebElement> cardType;






}

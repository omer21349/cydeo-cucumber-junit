package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "input[name=\'username\']")
    public WebElement username;
    @FindBy(xpath = "//input[@name=\'password\']")
    public WebElement password;

    @FindBy(xpath = "//button[@class=\'btn btn-primary login__submit\']")
    public WebElement loginButton;

    public void login(){
        this.username.sendKeys("Test");
        this.password.sendKeys("Tester");
        this.loginButton.click();
    }


    /**
     * this method will accept two arguments and longin.
     * @param username
     * @param password
     */
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();

    }

    public void loginWithConfig(){
        String username=ConfigurationReader.getProperty("webTableUsername");
        String password=ConfigurationReader.getProperty("webTablePassword");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }




}

package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTableLoginStepDefinitions {
    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();

    @When("Open a chrome browser. Go to web table login pages")
    public void go_to_https_web_table_cydeo_com_login() {
        String myUrl=ConfigurationReader.getProperty("webTableUrl");
       Driver.getDriver().get(myUrl);
    }
    @When("Enter username: {string}")
    public void enter_username_test(String userName) {
        webTableLoginPage.username.sendKeys(userName);

    }
    @When("Enter password: {string}")
    public void enter_password_tester(String password) {
        webTableLoginPage.password.sendKeys(password);
    }
    @And("user clicks to login button")
    public void userClicksToLoginButton() {
        webTableLoginPage.loginButton.click();
    }
    @Then("User should see url contains orders")
    public void verify_url() {
        BrowserUtils.verifyURL("orders");
    }


    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String pw) {
    webTableLoginPage.login(username,pw);
    }

    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credential) {
        /*credential.get("username");
        credential.get("password");

         */
        webTableLoginPage.login(credential.get("username"),credential.get("password"));

    }
}
/*
TC #: Login scenario
1- Open a chrome browser
2- Go to: https://web-table-2.cydeo.com/login
3- Enter username: Test
4- Enter password: Tester
5- Verify URL:
Expected: URL should end with “orders”
Note: Follow POM
Try different ways of implementing this step:
TC #: Login scenario using maps/ alternative practice
Scenario: User should be able to see all 12 months in
months
dropdown
Given User is on the login page of Web table app
When User enters below credentials
| username | Test |
| password | Tester |
Then User should see url contains orders
 */
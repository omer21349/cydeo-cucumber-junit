package com.cydeo.step_definitions;

import com.cydeo.pages.BasePages;
import com.cydeo.pages.OrderPages;
import com.cydeo.pages.ViewAllOrderPages;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Order_StepDefinitions {

    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    BasePages basePages=new BasePages();
    OrderPages orderPages=new OrderPages();
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
        webTableLoginPage.login();
        basePages.order.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select=new Select(orderPages.productDropdown);
        select.selectByVisibleText(string);
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer num) {
        orderPages.quantity.sendKeys(Keys.BACK_SPACE);
        orderPages.quantity.sendKeys(""+num);
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
         orderPages.costumerName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
         orderPages.street.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPages.city.sendKeys(string);
         
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
         orderPages.state.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
         orderPages.zip.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCard) {
        BrowserUtils.radioButtonSelector(orderPages.cardType,expectedCard);
        /*for (WebElement eachElement : orderPages.cardType) {
            if(eachElement.getAttribute("value").equalsIgnoreCase(expectedCard)){
                eachElement.click();
            }
        }*/
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
         orderPages.cardNo.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
     orderPages.cardExp.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
         orderPages.processOrder.click();
    } ViewAllOrderPages viewAllOrderPages=new ViewAllOrderPages();
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        Assert.assertTrue(viewAllOrderPages.orderFirstPlace.getText().contains(string));
    }
}
/*
TC #: Order place scenario
1- Given user is already logged in to web table app
2- When user is on the “Order” page
3- Then user enters appropriate test data
a. Product
b. Quantity
c. Customer name
d. Street
e. City
f. State
g. Zip
h. Payment info:
i. Card type: Visa/MasterCard/American Express
ii. Card No
iii. Expire date
4- And user clicks to “Process Order”
5- Then user should see new order in the table on “View all orders”
page
Note: Follow POM
#1- Parameterize scenario
#2- Scenario Outline after
 */
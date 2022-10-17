package com.cydeo.step_definitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class Practice {
    /*
    TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice
     */
    WebDriver driver;
   /* @Test
    public void test1(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
       // driver.findElement(By.xpath("//a[text()='A/B Testing']")).click();
        driver.findElement(By.linkText("A/B Testing")).click();

        Assert.assertEquals(driver.getTitle(),"No A/B Test");
        driver.navigate().back();
        Assert.assertEquals(driver.getTitle(),"Practice");

    }*/
//    @Test
//    public void test2(){
//
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://google.com");
//        driver.findElement(By.name("q")).sendKeys("apple", Keys.ENTER);
//        Assert.assertTrue(driver.getTitle().startsWith("apple"));
//
//    }


//    @Test
//    public void test2(){
//
////        TC #5: getText() and getAttribute() method practice
////        1- Open a chrome browser
////        2- Go to: https://practice.cydeo.com/registration_form
////        3- Verify header text is as expected:
////        Expected: Registration form
////        4- Locate “First name” input box
////        5- Verify placeholder attribute’s value is as expected:
////        Expected: first name
//        WebDriverManager.chromedriver().setup();
//        driver= new ChromeDriver();
//        driver.get("https://practice.cydeo.com/registration_form ");
//        Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
//        String actual=driver.findElement(By.xpath("//label[text()='First name']")).getText();
//        Assert.assertEquals(actual,"First name");
//    }



    /*
    TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password

     */

//    @Test
//    public void test2(){
//
//         WebDriverManager.chromedriver().setup();
//         driver=new ChromeDriver();
//         driver.get("https://login1.nextbasecrm.com/");
//         driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("incorrect");
//         driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("incorrect");
//         driver.findElement(By.xpath("//input[@value='Log In']")).click();
//        String actualMessage=driver.findElement(By.xpath("//div[@class='errortext']")).getText();
//        System.out.println(actualMessage);
//         Assert.assertEquals(actualMessage,"Incorrect login or password");
//
//    }



    /*
    TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

     */

//    @Test
//    public void test3(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("https://practice.cydeo.com/radio_buttons");
//        WebElement button=driver.findElement(By.id("hockey"));
//        button.click();
//        Assert.assertTrue(button.isSelected());
//
//    }
//
//    @Test
//    public void test4(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("http://practice.cybertekschool.com/dropdown");
//        Select state=new Select(driver.findElement(By.id("state")));
//        state.selectByVisibleText("Illinois");
//        state.selectByVisibleText("Virginia");
//        state.selectByVisibleText("California");
//        Assert.assertEquals(state.getFirstSelectedOption().getText(),"California");
//
//    }


//    @Test
//    public void test5() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("http://practice.cybertekschool.com/dropdown");
//
//        Select language = new Select(driver.findElement(By.name("Languages")));
//        List<WebElement> list = language.getOptions();
//        for(WebElement option:list){
//            option.click();
//         }
//        language.deselectAll();
//
//    }
//    @Test
//    public void test5() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://practice.cydeo.com/iframe");
//        driver.switchTo().frame(0);
//        Assert.assertTrue(driver.findElement(By.xpath("//p")).isDisplayed());
//    }

//    @Test
//    public void test5() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://practice.cydeo.com/windows");
//        driver.findElement(By.linkText("Click Here")).click();
//        Set<String>windows=driver.getWindowHandles();
//        for(String window:windows){
//            driver.switchTo().window(window);
//        }
//        Assert.assertEquals(driver.getTitle(),"New Window");
//    }

//    @Test
//    public void test1(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.cydeo.com/add_remove_elements/");
//        WebElement addElement=driver.findElement(By.xpath("//button[contains(@onclick,'add')]"));
//        addElement.click();
//        WebElement deleteButton=driver.findElement(By.xpath("//button[contains(@class,'man')]"));
//        Assert.assertTrue(deleteButton.isDisplayed());
//        deleteButton.click();
//
//        Assert.assertTrue(verifyIsDisplayed(addElement));
//
//    }
//
//    public boolean verifyIsDisplayed(WebElement element){
//      try {
//          if(element.isDisplayed()) return true;
//      }catch(Exception e){
//          return false;
//      }
//      return false;
//    }
//

//    @Test
//    public void radioButtonHandling(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.cydeo.com/radio_buttons");
//        WebElement button= driver.findElement(By.xpath("//input[contains(@id,'hoc')]"));
//        button.click();
//        Assert.assertTrue(button.isSelected());
//    }

//    @Test
//    public void radioButtonHandling() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.cydeo.com/dropdown");
//        Select select=new Select(driver.findElement(By.id("dropdown")));
//        String expectedText= select.getFirstSelectedOption().getText();
//        String actualText="Please select an option";
//        Assert.assertEquals(actualText,expectedText);
//        Select state=new Select(driver.findElement(By.id("state")));
//        String actualState=state.getFirstSelectedOption().getText();
//        String expectedState="Select a State";
//        Assert.assertEquals(actualState,expectedState);
//    }
//    @Test
//    public void radioButtonHandling() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://practice.cybertekschool.com/dropdown");
//        Select state=new Select(driver.findElement(By.id("state")));
//        state.selectByValue("IL");
//        state.selectByVisibleText("Virginia");
//        state.selectByIndex(5);
//        Assert.assertEquals(state.getFirstSelectedOption().getText(),"California");
//    }
//    @Test
//    public void selectingDate() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://practice.cybertekschool.com/dropdown");
//        Select year=new Select(driver.findElement(By.xpath("//select[contains(@id,'year')]")));
//        year.selectByVisibleText("1923");
//        Select month=new Select(driver.findElement(By.xpath("//select[contains(@id,'month')]")));
//        month.selectByValue("11");
//        Select day=new Select(driver.findElement(By.xpath("//select[contains(@id,'day')]")));
//        day.selectByIndex(0);
//    }
//    @Test
//    public void nonSelect() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://practice.cybertekschool.com/dropdown");
//        driver.findElement(By.id("dropdownMenuLink")).click();
//        driver.findElement(By.linkText("Facebook")).click();
//        Assert.assertEquals(driver.getTitle(),"Facebook - log in or sign up");
//    }
//    @Test
//    public void nonSelect() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.cydeo.com/dropdown");
//        Select languages=new Select(driver.findElement(By.name("Languages")));
//        List<WebElement>listOfLanguage=languages.getOptions();
//        for(WebElement language:listOfLanguage){
//           language.click();
//        }
//        languages.deselectAll();
//    }
//    @Test
//    public void nonSelect() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.cydeo.com/iframe");
//        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
//        WebElement p=driver.findElement(By.xpath("//p"));
//        Assert.assertTrue(p.isDisplayed());
//        driver.switchTo().parentFrame();
//        String actualIframe=driver.findElement(By.xpath("//h3")).getText();
//        String expectedIframe="An iFrame containing the TinyMCE WYSIWYG Editor";
//        Assert.assertEquals(actualIframe,expectedIframe);
//
//    }
//    @Test
//    public void nonSelect() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.cydeo.com/windows");
//        driver.findElement(By.linkText("Click Here")).click();
//        Set<String>windows=driver.getWindowHandles();
//
//        for(String window:windows){
//          driver.switchTo().window(window);
//        }
//        System.out.println(driver.getTitle());
//    }

//    @Test
//    public void nonSelect() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://practice.cydeo.com/iframe");
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'mce_0_ifr')]")));
//        WebElement content=driver.findElement(By.id("tinymce"));
//        Assert.assertTrue(content.isDisplayed());
//        driver.switchTo().parentFrame();
//        WebElement header=driver.findElement(By.xpath("//h3"));
//        Assert.assertTrue(header.isDisplayed());
//    }
    @Test
    public void nonSelect() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/windows");
        Assert.assertEquals(driver.getTitle(),"Windows");
        Set<String>windows=driver.getWindowHandles();

        for(String window:windows){
           driver.switchTo().window(window);
        }
        System.out.println(driver.getTitle());
    }



}
/*
TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */
/*
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */


/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.
 */
/*
TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */
/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using  : visible text
Select month using   : value attribute
Select day using : index number
 */
/*
TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */

/*

TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */


/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #3: Utility method task for (continuation of Task2)
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
 */
/*
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
 */
/*
TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */
/*
TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */
/*
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */
/*

1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */
/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.
 */
/*
TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */
/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */

/*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
 */
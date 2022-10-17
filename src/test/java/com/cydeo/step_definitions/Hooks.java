package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
in the class we will be able to pass pre- & post- conditions to each scenario and each step
 */
public class Hooks {


    @Before
    public void setupScenario(){
        System.out.println("===> setting up browser before");
    }
    @After
    public void tearDownScenario(Scenario scenario){
        if(scenario.isFailed()) {
            byte[] screenShoot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShoot, "image/png", scenario.getName());
            //BrowserUtils.sleep(3);
        }
        Driver.closeDriver();
    }

    @BeforeStep(value = "@login",order = 1) // if we say this (value = "@login",order = 1) so we can make which one will execute first
    public void setupEachStep(){
        System.out.println("@@@doing for each steps");
    }
    @AfterStep
    public void tearDownForEachStep(){
        System.out.println("$$$$closing  after for each step");
    }



}

package com.cydeo.step_definitions;


import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {


    //@Before must come from cucumber -> io.cucumber.java
    //Do NOT Choose @Before() from JUnit does NOT Handle scenarios
    //@Before ()
    public void setUpScenario(){
        System.out.println("Setting up browser using cucumber @Before each scenario");
        Driver.getDriver().navigate().to("URL of your app");
    }

    //@After annotation must come from io.cucumber.java
    @After
    public void teardownScenario(Scenario scenario){ //-> comes from io.cucumber.java
        // we will implement taking screenshot in this method
        System.out.println("It will be closing browser using cucumber @After each scenario");

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES); // store this in byte[] array
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
// -> comes from Driver class // -> after every Scenario
        Driver.closeDriver();
    }



   // @Before (value = "@login", order = 2)
    public void setupLogin(){
        // If you want any code to run before any specific feature/scenario, you can use the (value ="@tagName") to determine this.
        System.out.println("Setting up browser using cucumber @Before @login Scenario ");
    }
    //@Before (value = "@db",order = 3)
    public void setUpDataBaseScenario(){

    }



   // @BeforeStep
    public void setupScenarioStepForLogin(){
        System.out.println("Setting up browser using cucumber @Before each scenario step for login");
    }

}

package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //We Create a private constructor, so we are closing direct access  to the object of this class from outside of any class
    private Driver(){

    }

    /*
    Making our "Driver" instance private, so that it is not reachable from the outside of any other class.
    We make it static, because we want it to run before anything else,
    also we will use it in static method
     */


    //Explanation: Create a reusable method which will return same driver instance when we call it.

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver getDriver(){

        if (driverPool.get() == null){

            String browserType = ConfigurationReader.getProperty("browser");

            //(Depending on the browserType our switch statement will determine to open specific type of browser

            switch (browserType){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }

        }

        //same driver instance will be returned every time we call Driver.getDriver() method
        return driverPool.get();
    }



public static void closeDriver(){

        if (driverPool.get() != null){
            driverPool.get().quit(); // this will kill the session. value will not be null
            driverPool.remove();
        }
    }




}

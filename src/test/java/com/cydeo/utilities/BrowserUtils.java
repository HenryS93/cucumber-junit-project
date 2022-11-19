package com.cydeo.utilities;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class BrowserUtils {

    public static void switchWindowAndVerify(String expectedInUrl,String expectedTitle){

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allWindowHandles){
            Driver.getDriver().switchTo().window(eachWindow);

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Title verification failed!",actualTitle.contains(expectedTitle));
    }




    /*
    Methods are static because we do NOT want to create an object to call these methods
    We just want to call those methods with className

     */


    /*
    - This method is used to pause the code for the give seconds
    - It is static method we can call with className
    - BrowserUtils.sleep
     */

    public static void sleep(int seconds){
       try {
           Thread.sleep(seconds * 1000);
       }catch (InterruptedException e){
           e.printStackTrace();
           System.out.println("Exception happened in sleep method");
       }

    }

    /*
    Method info:
    - Name: VerifyTitle()
    - Return Type: void
    - Arg1: WebDriver
    - Arg2: String expectedTitle

     */



    public static void verifyTitle(WebDriver driver, String expectedTitle){
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle,"Title Not Matching!, Check your Code");

    }

    public static void waitForInvisibilityOf(WebElement element){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * This method will accept dropdown as a WebElement
     * and return all options as text in a List of String
     * @return List<String>
     */
    public static List<String> dropdownOptionAsString(WebElement dropdownElement){

        Select selectMonth = new Select(dropdownElement);

        //List of all ACTUAL Month <Options> as a WebElement
        List<WebElement> actualOptionsAsElement = selectMonth.getOptions();

        //List of all ACTUAL month <Options> as a String
        List<String> actualOptionsAsString = new ArrayList<>();

        //With using for loop we will convert each WebElement of options to String with Using getText() method
        //With using add() method we will add each String option in List<String> actual options as String
        for (WebElement eachMonth : actualOptionsAsElement){
            actualOptionsAsString.add(eachMonth.getText());
        }
    return actualOptionsAsString;
    }

    /**
     * This method will accept a group of radio buttons and as a List<WebElements>
     * It will loop through the List, and click to the radio button with same attribute value
     * @param radioButtons
     * @param attributeValue
     */
    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {

        for (WebElement eachCard : radioButtons) {

            if (eachCard.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                eachCard.click();
            }

        }


    }
}

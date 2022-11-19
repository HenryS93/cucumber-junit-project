package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day18_WebTableApp{
   public Day18_WebTableApp(){
    PageFactory.initElements(Driver.getDriver(),this);
}


    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameInputBox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordInputBox;

    @FindBy (xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * This method will username and password and login to app
     * @param username
     * @param password
     */
    public void  login(String username, String password){

    usernameInputBox.sendKeys(username);
    passwordInputBox.sendKeys(password);
    loginButton.click();

    }
}

package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrder_Page extends BasePage{

    public WebTableOrder_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//select[@name='product']")
    public WebElement selectByProductDropdown;

    @FindBy (xpath = "//input[@name='quantity']")
    public WebElement quantityInputBox;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement customerNameInputBox;

    @FindBy (xpath = "//input[@name='street']")
    public WebElement streetInputBox;

    @FindBy (xpath = "//input[@name='city']")
    public WebElement cityInputBox;

    @FindBy (xpath = "//input[@name='state']")
    public WebElement stateInputBox;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement zipcodeInputBox;


    @FindBy (xpath = "//input[@name='card']")
    public List<WebElement> cardTypeRadioButton;

    @FindBy (xpath = "//input[@name='cardNo']")
    public WebElement cardNumberInputBox;

    @FindBy (xpath = "//input[@name='cardExp']")
    public WebElement cardExpDateInputBox;


    @FindBy (xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

}

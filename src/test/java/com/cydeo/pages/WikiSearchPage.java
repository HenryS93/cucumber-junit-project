package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@id='searchInput']")
    public WebElement wikiInputSearchBox;


    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy (xpath = "(//span)[.='Steve Jobs'][1]")
    public WebElement wikiTitle;

    @FindBy (xpath = "//img[@alt='Steve Jobs Headshot 2010-CROP (cropped 2).jpg']")
    public WebElement image;


}

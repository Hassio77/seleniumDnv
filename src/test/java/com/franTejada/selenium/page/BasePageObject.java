package com.franTejada.selenium.page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePageObject {
	/*
	 * This is the Base Page Objetc, I will use this class to define the main specs of all the 
	 * page object classes that extends this one.
	 * 
	 */
	WebDriver driver;			//Declare Selenium WebDriver
	Actions actions;			//Declare Actions for mouse and keyboard events
	WebDriverWait wait;			//Declare WebDriverWait, for waiting elements under expected conditions
	
	//Declaration of variables containing diverse URL of interest
	public static final String homeURL="https://www.dnvgl.com/#";		
	public static final String maritimeURL="https://www.dnvgl.com/maritime/insights/index.html";
	
	
	public BasePageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions= new Actions(driver);
        wait = new WebDriverWait(driver,10);	//Here I define the Max. time of waiting in case the condition is not met, 10 secs in this case
    }
    
	@FindBy(xpath = "//a[contains(@title,'DNVGL.com')]")		//This element is common in almost all sites of the DNVGL web
	WebElement dnvHeaderLogo;
	
	//Flat wait, recieves as an argument a long, its value will be the wait time in seconds
    protected void flatWait(long s) {
        try {
            Thread.sleep(1000*s);
        } catch (Exception ie) {
            // do nothing
        }
    }

    //This method waits an element to be clickable
    protected void waitElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //This method waits an element to be visible
    protected void waitElementIsVisible(WebElement element) {
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
    //This method will use the browser navigation tools to go back
    protected void back() {
    	driver.navigate().back();
    }
	
}

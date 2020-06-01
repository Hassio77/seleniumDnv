package com.franTejada.selenium.page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePageObject {
	
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	public static final String homeURL="https://www.dnvgl.com/#";
	public static final String maritimeURL="https://www.dnvgl.com/maritime/insights/index.html";
	
	
	public BasePageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions= new Actions(driver);
        wait = new WebDriverWait(driver,10);
    }
    
	@FindBy(xpath = "//a[contains(@title,'DNVGL.com')]")
	WebElement dnvHeaderLogo;
	
    protected void flatWait(long s) {
        try {
            Thread.sleep(1000*s);
        } catch (Exception ie) {
            // do nothing
        }
    }

    protected void waitElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    
    protected void waitElementIsVisible(WebElement element) {
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    protected void back() {
    	driver.navigate().back();
    }
	
}

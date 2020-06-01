package com.franTejada.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsightsMaritimePage extends BasePageObject{

	/*
	 * Class to define the DNVGL Insights/Maritimes and all its methods
	 */
	
	public InsightsMaritimePage(WebDriver driver) {
		super(driver);
	    this.driver=driver;
	}
	

	
	@FindBy(xpath="//span[contains(@class,'the-header__current-location')]//child::a[contains(text(),'Maritime')]")
	WebElement headerTitle;
	
	//Public methods that will be used in tests
	
	public boolean checkCurrentlyOnMaritime() {
		waitElementIsVisible(headerTitle);
		return driver.getCurrentUrl().equals(maritimeURL) && headerTitle.isDisplayed() ? true : false;
	}
	

}

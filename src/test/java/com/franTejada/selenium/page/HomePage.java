package com.franTejada.selenium.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePageObject {

	/*
	 * Class to define the DNVGL Home Page and all its methods
	 */

	
	public HomePage(WebDriver driver) {
		super(driver);
	    this.driver=driver;
	}
	
	
	//BANNER ELEMENTS
	
	//Insights
	@FindBy(xpath = "//a[contains(@class,'the-header__nav-item') and contains(text(),'Insights')]")
	WebElement headerInsights;
	
	@FindBy(xpath = "//a[contains(@class,'shortcuts__link')and contains(@title,'Maritime')]")
	WebElement insightsMaritimeLink;
	
	
	//Sectors
	@FindBy(xpath = "//a[contains(@class,'the-header__nav-item') and contains(text(),'Sectors')]")
	WebElement headerSectors;
	
	@FindBy(xpath = "//li[contains(@id,'dropdown-sector-Power and renewables')]")
	WebElement sectorsRenewableDropDown;
	
	
	
	//Services
	@FindBy(xpath = "//a[contains(@class,'the-header__nav-item') and contains(text(),'Services')]")
	WebElement headerServices;
	
	@FindBy(xpath = "//li[contains(@id,'Advisory')]")
	WebElement servicesAdvisoryDropDown;
	
	
	//AboutUs
	@FindBy(xpath = "//a[contains(@class,'the-header__nav-item') and contains(text(),'About us')]")
	WebElement headerAboutUs;
	
	@FindBy(xpath = "//a[contains(@title,'Our history')]")
	WebElement aboutUsOurHistoryLink;
	
	
	//OTHER ELEMENTS
	
	@FindBy(xpath = "//a[contains(@class,'the-header__login')]")
	WebElement goToVeracityLoginButton;
	
	
	//Public methods that will be used in tests
	
	public void bannerNavigateToInsightsMaritimes() {
		actions.moveToElement(headerInsights).perform();
		waitElementIsVisible(insightsMaritimeLink);
		insightsMaritimeLink.click();
	}
	
	public boolean bannerBehavior() {
		return bannerAboutUsCheck() &&
				bannerInsightsCheck() &&
				bannerSectorsCheck() &&
				bannerServicesCheck()
				? true : false;
	}
	
	public void goToVeracityLogin() {
		goToVeracityLoginButton.click();
	}
	
	//Private methods that will define complexes actions in public methods used in tests
	
	private boolean bannerInsightsCheck() {
		actions.moveToElement(headerInsights).perform();
		waitElementIsVisible(insightsMaritimeLink);
		return insightsMaritimeLink.isDisplayed() ? true : false;
	}
	
	private boolean bannerSectorsCheck() {
		actions.moveToElement(headerSectors).perform();
		waitElementIsVisible(sectorsRenewableDropDown);
		return sectorsRenewableDropDown.isDisplayed() ? true : false;
	}
	
	private boolean bannerServicesCheck() {
		actions.moveToElement(headerServices).perform();
		waitElementIsVisible(servicesAdvisoryDropDown);
		return servicesAdvisoryDropDown.isDisplayed() ? true : false;
	}
	
	private boolean bannerAboutUsCheck() {
		actions.moveToElement(headerAboutUs).perform();
		waitElementIsVisible(aboutUsOurHistoryLink);
		return aboutUsOurHistoryLink.isDisplayed() ? true : false;
	}
}

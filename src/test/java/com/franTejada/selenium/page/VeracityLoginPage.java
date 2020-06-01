package com.franTejada.selenium.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VeracityLoginPage extends BasePageObject {

	/*
	 * Class to define the DNVGL Veracity Login and all its methods
	 */

	public static final String textForUser="user";			//Initialize variables containing text that will be send to user/pass inputs
	public static final String textForPassword="password";
	
	public VeracityLoginPage(WebDriver driver) {
		super(driver);
	    this.driver=driver;
	}
	
	//LOGIN ELEMENTS
	
	@FindBy(xpath="//input[contains(@id,'userNameInput')]")
	WebElement usernameInput;
	
	@FindBy(xpath="//input[contains(@id,'passwordInput')]")
	WebElement passwordInput;
	
	@FindBy(xpath="//span[contains(@id,'submitButton')]")
	WebElement submitButton;
	
	@FindBy(xpath="//label[contains(@id,'errorText')and contains(text(),'Enter your email address in the format')]")
	WebElement noEmailErrorMessage;
	
	@FindBy(xpath="//label[contains(@id,'errorText')and contains(text(),'Enter your password.')]")
	WebElement noPasswordErrorMessage;
	
	@FindBy(xpath="//label[contains(@id,'errorText')and contains(text(),'Incorrect email or password. Please try again.')]")
	WebElement wrongUserOrPasswdErrorMessage;
	
	
	//Public methods that will be used in tests
	
	public boolean checkCurrentlyOnLogin() {
		waitElementIsVisible(submitButton);
		return submitButton.isDisplayed() ? true : false;
	}
	
	public boolean emptyUserEmptyPassword() {
		clickOnSubmit();
		flatWait(1);
		return noEmailErrorMessage.isDisplayed() ? true : false;
	}
	
	public boolean emptyPassword() {
		sendUser();
		clickOnSubmit();
		flatWait(1);
		return noPasswordErrorMessage.isDisplayed() ? true : false;
	}
	
	public boolean wrongUserPassword() {
		sendUser();
		sendPassword();
		clickOnSubmit();
		flatWait(1);
		return wrongUserOrPasswdErrorMessage.isDisplayed() ? true : false;
	}
	
	
	//Private methods that will define complexes actions in public methods used in tests
	
	private void clickOnSubmit() {
		submitButton.click();
	}
	
	private void sendUser() {
		usernameInput.sendKeys(textForUser);
	}
	
	private void sendPassword() {
		passwordInput.sendKeys(textForPassword);
	}
	
	
	
}

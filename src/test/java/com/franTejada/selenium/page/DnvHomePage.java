package com.franTejada.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DnvHomePage extends BasePageObject {

	WebDriver driver;
	
	public DnvHomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	@FindBy(xpath = "//a[contains(@class,'the-header__nav-item') and contains(text(),'Insights')]")
	WebElement button;

	public void clickButton() {
		button.click();
	}
}

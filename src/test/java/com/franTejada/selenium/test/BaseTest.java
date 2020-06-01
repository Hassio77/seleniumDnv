package com.franTejada.selenium.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.franTejada.selenium.page.BasePageObject;

public class BaseTest {

	private String baseUrl = BasePageObject.homeURL;
	String chromeDriverPath = "src/main/resources/chromedriver.exe";
	public WebDriver driver;


	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@AfterMethod
	public void endTest() {
		driver.quit();
	}
}

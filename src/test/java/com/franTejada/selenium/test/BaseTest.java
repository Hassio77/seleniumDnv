package com.franTejada.selenium.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.franTejada.selenium.page.BasePageObject;

public class BaseTest {

	private String baseUrl = BasePageObject.homeURL; //Define the URL that driver will get first in the test
	String chromeDriverPath = "src/main/resources/chromedriver.exe"; //Define the route to the driver executable
	public WebDriver driver;

	//Method to initialize driver before each test, using the variables previously defined
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);	//Set chrome as driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();	//Using driver maximized
		driver.get(baseUrl);
	}
	
	//Closing driver after each test, we can take other actions here if we desire, like screenshots for example
	@AfterMethod
	public void endTest() {
		driver.quit();
	}
}

package com.franTejada.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public String baseUrl = "https://www.dnvgl.com/#";
	String driverPath = "C:\\utils\\selenium\\chromedriver.exe";
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void endTest() {
		driver.close();
	}
}

package com.franTejada.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

import com.franTejada.selenium.page.*;

public class MyTest extends BaseTest{

	@Test
	public void test() {		
		DnvHomePage ob = new DnvHomePage(driver);
		ob.clickButton();
		
	}
}

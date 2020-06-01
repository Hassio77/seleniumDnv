package com.franTejada.selenium.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

import com.franTejada.selenium.page.*;

public class MyTest extends BaseTest{

	@Test
	public void bannerBehaviorTest() {		
		HomePage homePage = new HomePage(driver);
		assertTrue(homePage.bannerBehavior());
	}
	
	@Test
	public void bannerNavigateInsightsMaritime() {
		HomePage homePage = new HomePage(driver);
		InsightsMaritimePage insightsMaritimePage = new InsightsMaritimePage(driver);
		homePage.bannerNavigateToInsightsMaritimes();
		assertTrue(insightsMaritimePage.checkCurrentlyOnMaritime());
	}
}

package com.franTejada.selenium.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

import com.franTejada.selenium.page.*;

public class MyTest extends BaseTest {

	// This test checks that the header menu is responding as expected when moving
	// the mouse through items
	@Test
	public void bannerBehaviorTest() {
		HomePage homePage = new HomePage(driver);
		assertTrue(homePage.bannerBehavior());
	}

	/*
	 * This test checks that the navigation to Insights/Maritimes using home header
	 * menu is propper, asserting that URL is correct and an element of that page is
	 * being displayed
	 */
	@Test
	public void bannerNavigateInsightsMaritime() {
		HomePage homePage = new HomePage(driver);
		InsightsMaritimePage insightsMaritimePage = new InsightsMaritimePage(driver);
		homePage.bannerNavigateToInsightsMaritimes();
		assertTrue(insightsMaritimePage.checkCurrentlyOnMaritime());
	}

	// This test starts in home page, then navigate to Veracity login page and check
	// error message when submitting with user/pass fields empty
	@Test
	public void loginVeracityNoUserNoPassword() {
		HomePage homePage = new HomePage(driver);
		VeracityLoginPage loginPage = new VeracityLoginPage(driver);
		homePage.goToVeracityLogin();
		assertTrue(loginPage.checkCurrentlyOnLogin());
		assertTrue(loginPage.emptyUserEmptyPassword());
	}

	// This test starts in home page, then navigate to Veracity login page and check
	// error message when submitting with password field empty
	@Test
	public void loginVeracityNoPassword() {
		HomePage homePage = new HomePage(driver);
		VeracityLoginPage loginPage = new VeracityLoginPage(driver);
		homePage.goToVeracityLogin();
		assertTrue(loginPage.checkCurrentlyOnLogin());
		assertTrue(loginPage.emptyPassword());
	}

	// This test starts in home page, then navigate to Veracity login page and check
	// error message when submitting using wrong user or password
	@Test
	public void loginVeracityWrongCredentials() {
		HomePage homePage = new HomePage(driver);
		VeracityLoginPage loginPage = new VeracityLoginPage(driver);
		homePage.goToVeracityLogin();
		assertTrue(loginPage.checkCurrentlyOnLogin());
		assertTrue(loginPage.wrongUserPassword());
	}
}

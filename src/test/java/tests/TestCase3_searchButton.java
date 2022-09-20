package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.searchButtonPage;

public class TestCase3_searchButton extends BaseClass{
	
	@Test(groups = {"regression"} ,priority = 3)
	public void search() throws InterruptedException, IOException
	{
		TestCase1_login.loginTest();
	
		String actual_title = driver.getTitle();
		String expected_title = "Amazon Sign-In";
		
		searchButtonPage search = PageFactory.initElements(driver, searchButtonPage.class);
		
		ExtentTest test = extent.createTest("TestCase3", "Search Button").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		search.enterTextToBeSearched("Couches");
		search.clickSearchButton();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Couches")));
		
		Assert.assertEquals(actual_title, expected_title);
		test.pass("Test completed successfully");
	}

}

package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.BrowserHistoryPage;

public class TestCase11_BrowserHistory extends BaseClass{
	
	@Test(groups = {"regression"},priority = 11)
	public void BrowserHistory() throws IOException, Exception
	{

		TestCase1_login.loginTest();
		
		ExtentTest test = extent.createTest("TestCase11", "Browser History").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		BrowserHistoryPage browserHistory = PageFactory.initElements(driver, BrowserHistoryPage.class);
		
		browserHistory.BrowserHistoryLinkText();
		
		assert driver.findElement(By.cssSelector(".a-size-large.a-color-information")).isDisplayed();
		
		test.pass("Test completed successfully");
	}

}

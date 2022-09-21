package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageFactory.TodaysDealPage;

public class TestCase5_TodaysDeals extends BaseClass{
	
	@Test(groups = {"regression"} ,priority = 5)
	public void todaysDeals() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		TodaysDealPage deals = PageFactory.initElements(driver, TodaysDealPage.class);
		
		ExtentTest test = extent.createTest("TestCase5", "Today's Deals").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		deals.todayDeals();
		
		Assert.assertEquals(driver.getTitle(), "Amazon.com - Today's Deals");
		
		test.pass("Test completed successfully");
	}

}

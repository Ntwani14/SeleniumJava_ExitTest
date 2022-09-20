package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.BuyAgainPage;

public class TestCase7_BuyAgain extends BaseClass{
	
	@Test(groups = {"regression"},priority = 7)
	public void BuyAgain() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		BuyAgainPage buyAgain = PageFactory.initElements(driver, BuyAgainPage.class);
		
		ExtentTest test = extent.createTest("TestCase7", "Buy Again").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		buyAgain.clickBuyAgainPartialLink();
		
		Assert.assertEquals(driver.getTitle(), "Buy Again");
		test.pass("Test completed successfully");
	}

}

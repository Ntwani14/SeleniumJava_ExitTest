package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.myAmazonPage;

public class TestCase6_myAmazon extends BaseClass{
	
	@Test(groups = {"regression"},priority = 6)
	public void myAmazon() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		ExtentTest test = extent.createTest("TestCase6", "My Amazon").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		
		myAmazonPage myAmazon = PageFactory.initElements(driver, myAmazonPage.class);
		
		myAmazon.clickAmazonPartialLink();
		
		assert myAmazon.validatePage();
		
		test.pass("Test completed successfully");
	}

}

package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageFactory.GiftCardPage;

public class TestCase8_GiftCards extends BaseClass{
	
	@Test(groups = {"regression"},priority = 8)
	public void GiftCards() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		ExtentTest test = extent.createTest("TestCase8", "Gift Cards ").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		GiftCardPage giftCard = PageFactory.initElements(driver, GiftCardPage.class);
		
		giftCard.clickGiftCardPartialLink();
		
		Assert.assertEquals(driver.getTitle(), "Amazon.com Gift Cards");
		test.pass("Test completed successfully");
	}

}

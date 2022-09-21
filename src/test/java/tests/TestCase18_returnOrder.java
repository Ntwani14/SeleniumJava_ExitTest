package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageFactory.returnOrderPage;

public class TestCase18_returnOrder extends BaseClass{
	
	@Test(groups = {"regression"},priority = 18)
	public void ReturnOrder() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		
		returnOrderPage returnOrder = PageFactory.initElements(driver, returnOrderPage.class);
		
		ExtentTest test = extent.createTest("TestCase18", "Return Order").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		returnOrder.clickLinkText();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		Assert.assertEquals(driver.getTitle(), "Your Orders");
		
		test.pass("Test completed successfully");
	}

}

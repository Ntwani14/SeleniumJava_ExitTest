package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageFactory.CustomerServicesPage;

public class TestCase9_CustomerServices extends BaseClass{

	@Test(groups = {"regression"},priority = 9)
	public void CustomerServices() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		CustomerServicesPage customerServices = PageFactory.initElements(driver, CustomerServicesPage.class);
		
		ExtentTest test = extent.createTest("TestCase9", "Customer Services").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");

		customerServices.clickCustomerServiceslinkText();
		
		test.pass("Test completed successfully");
		
		Assert.assertEquals(driver.getTitle(), "Amazon Customer Service Support – Amazon.com");
	}
}

package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.deleteAddressPage;

public class TestCase16_DeleteAddress extends BaseClass{
	
	@Test(groups = {"smoke"},priority = 16)
	public void DeleteAddress() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		

		deleteAddressPage deleteAddress =  PageFactory.initElements(driver, deleteAddressPage.class);
		
		ExtentTest test = extent.createTest("TestCase16", "Delete Address").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		deleteAddress.clickLocationLinkText();
		
		assert deleteAddress.validatePage();
		
		deleteAddress.clickPartialLink();
		
		deleteAddress.clickDeleteBtn();
		
		deleteAddress.clickSubmitButton();
		
		test.pass("Test completed successfully");

	}
}

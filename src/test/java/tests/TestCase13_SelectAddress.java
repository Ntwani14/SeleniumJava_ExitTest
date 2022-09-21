package tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageFactory.SelectAddressPage;

public class TestCase13_SelectAddress extends BaseClass{
	
	@Test(groups = {"smoke"},priority = 13,enabled = false)
	public void SelectAddress() throws IOException, Exception
	{
		
		TestCase1_login.loginTest();
	
		SelectAddressPage selectAddress = PageFactory.initElements(driver, SelectAddressPage.class);
		
		ExtentTest test = extent.createTest("TestCase13", "Select Address").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		selectAddress.clickLocationLink();
		selectAddress.validateText();
		selectAddress.clickselectAll();
		selectAddress.buttonClick();
		selectAddress.btnClickDoneButton();
		selectAddress.validate_TextDispayed();
		
		test.pass("Test completed successfully");
	}

}

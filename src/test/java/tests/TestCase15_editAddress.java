	package tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageFactory.editAddressPage;

public class TestCase15_editAddress extends BaseClass{
	
	@Test(groups = {"smoke"},priority = 15)
	public void editAddress() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		

		editAddressPage editAddress = PageFactory.initElements(driver, editAddressPage.class);
		
		ExtentTest test = extent.createTest("TestCase15", "Edit Address").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		editAddress.clickLocationLinkText();
		
		assert editAddress.validatePage();
		
		editAddress.clickPartialLink();
		
		Assert.assertEquals(driver.getTitle(), "Your Addresses");
		
		editAddress.selectAddresstoEdit();

		editAddress.btnClickEditButton();

		editAddress.clearTextBox();
		
		editAddress.enterName("Shane Baloyi");
		
		editAddress.clickSubmit();
		
		editAddress.selectOption();
		
		editAddress.clickContinueButton();
		
		Assert.assertEquals(driver.getTitle(), "Your Addresses");
		
		test.pass("Test completed successfully");
	
	}
}

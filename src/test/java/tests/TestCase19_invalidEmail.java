package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.invalidEmailPage;

public class TestCase19_invalidEmail extends BaseClass{
	
	@Test(groups = {"smoke"},priority = 19)
	public void LoginWithInvalidEmail() throws IOException
	{
		
		String actual_title = driver.getTitle();
		String expected_title = "Amazon.com. Spend less. Smile more.";
		
		Assert.assertEquals(actual_title, expected_title);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		ExtentTest test = extent.createTest("TestCase19", "Invalid Email").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		invalidEmailPage invalidEmail = PageFactory.initElements(driver, invalidEmailPage.class);
		
		invalidEmail.clickSignPartialLink();
		
		invalidEmail.enterInvalidEmail(PropertiesFile.getInvalidEmail());
		
		invalidEmail.clickContinueButton();
		
		Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		
		test.pass("Test completed successfully");
		
	}

}

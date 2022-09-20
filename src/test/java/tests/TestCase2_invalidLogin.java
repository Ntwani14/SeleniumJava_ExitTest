package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.invalidLoginPage;

public class TestCase2_invalidLogin extends BaseClass{
	
	@Test(groups = {"regression"} ,priority = 2)
	public void loginWithInvalidPassword() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		invalidLoginPage invalidPogin = PageFactory.initElements(driver, invalidLoginPage.class);
		
		ExtentTest test = extent.createTest("TestCase2", "Invalid signin").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		invalidPogin.clickSignPartialLink();
		invalidPogin.enterEmail(PropertiesFile.getEmail());
		invalidPogin.clickContinueButton();
		invalidPogin.enterPassword(PropertiesFile.getInvalidPassword());
		invalidPogin.clicksignInSubmitButton();
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Amazon Sign-In";
		
		assertEquals(actualPageTitle ,expectedPageTitle);
		
		test.pass("Test completed successfully");
	}

}

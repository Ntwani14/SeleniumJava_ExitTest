package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.LoginPage;


public class TestCase1_login extends BaseClass{
	
	@Test(groups = {"regression"},priority = 1)
	public static void loginTest() throws InterruptedException, IOException{

		String actual_title = driver.getTitle();
		String expected_title = "Amazon.com. Spend less. Smile more.";
		
		Assert.assertEquals(actual_title, expected_title);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		ExtentTest test = extent.createTest("TestCase1", "Signin").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		login.clickSigninPartialLink();
		login.enterEmail(PropertiesFile.getEmail());
		login.clickContinueButton();
		login.enterPassword(PropertiesFile.getPassword());
		login.clickSigninButton();
		
		Assert.assertEquals(actual_title, expected_title);
		test.pass("Test completed successfully");
		
		log.info("Test passes, Test executed successfully");
	}
}

package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.RegistryPage;

public class TestCase10_Registry extends BaseClass{

	@Test(groups = {"regression"},priority = 10)
	public void Registry() throws Exception
	{
		try {
			TestCase1_login.loginTest();
			
			ExtentTest test = extent.createTest("TestCase10", "Registry").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
			test.log(Status.INFO, "TestCase started");
			
			RegistryPage registry = PageFactory.initElements(driver, RegistryPage.class);
			
			registry.clickRegistryLinkText();
			
			Assert.assertEquals(driver.getTitle(), "Amazon Registry & Gifting");
			test.pass("Test completed successfully");
			
		} catch (IOException e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		
	}
	
}

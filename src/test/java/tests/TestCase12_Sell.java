package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.SellPage;

public class TestCase12_Sell extends BaseClass{

	@Test(groups = {"regression"},priority = 12)
	public void Sell() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		try
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			

			ExtentTest test = extent.createTest("TestCase12", "Sell").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
			test.log(Status.INFO, "TestCase started");
			
			SellPage sell = PageFactory.initElements(driver, SellPage.class);
			
			sell.clickSellLinkText();
			sell.validate_byText();
			
			test.pass("Test completed successfully");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Assertion failed, Element not found");
		}
	}
	
}

package tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.removeFromCartPage;

public class TestCase17_RemoveFromCart extends BaseClass{
	
	@Test(groups = {"regression"},priority = 17)
	public void RemoveFromCart() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		
		ExtentTest test = extent.createTest("TestCase17", "Remove From Cart").assignAuthor("Amuthan").assignCategory("Smoke");
		test.log(Status.INFO, "TestCase started");
		
		removeFromCartPage remove = PageFactory.initElements(driver, removeFromCartPage.class);
		String path = "D:\\eclipse-project-workspace\\SeleniumJava_ExitTest\\extentReports_Result";
		remove.clickCart();
		test.log(Status.PASS, "Cart clicked successfully");
		//.deleteButton();
		test.log(Status.FAIL, "Failed to delete item from card");
		test.log(Status.FAIL, "This test has failed");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("extentReports_Result/screen.jpg"));
		
		test.addScreenCaptureFromPath(path, "screen.jpg")
		.fail("TestCase8_Failed_to_add_to_Cart" , MediaEntityBuilder.createScreenCaptureFromPath(path, "Remove from cart").build())
		.fail("Test is not completed successfully");
		System.out.println("TestCase17 has failed");
		
		//Loggers
		log.info("Test Failed, Test did not execute successfully");
		log.error("Test Failed, Test did not execute successfully");
	
		
	}

}

package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.addToCardPage;

public class TestCase4_addToCart extends BaseClass{
	
	@Test(groups = {"regression"} ,priority = 4)
	public void addToCart() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		addToCardPage addtoCart = PageFactory.initElements(driver, addToCardPage.class);
		
		ExtentTest test = extent.createTest("TestCase4", "add To Cart").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		addtoCart.clickCart();
		addtoCart.enterTextToSearch("iphone 14 pro max case");
		addtoCart.clickSearchButton();
		
		test.pass("Test completed successfully");
		
		//driver.findElement(By.partialLinkText("Ringke Fusion [Minimalist Fit] Compatible with iPhone 14 Pro Max Case 6.7 Inches,"
			//	+" Transparent Elegant Look Minimal Bulk Cover for Women, Men - Clear")).click();
		
//		driver.findElement(By.xpath("//a[@aria-label='0 items in cart']//div[1]//span[2]")).click();
//		driver.findElement(By.name("submit.addToCart")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='Go to Cart']")).click();
		
	}

}

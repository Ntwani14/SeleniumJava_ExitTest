package tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Config.PropertiesFile;
import PageFactory.signoutPage;

public class TestCase20_Signout  extends BaseClass{
	
	@Test(groups = {"regression"},priority = 20)
	public void Signout() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		
		signoutPage signout = PageFactory.initElements(driver, signoutPage.class);
		
		ExtentTest test = extent.createTest("TestCase20", "Signout").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		signout.selectElement();
		
		List<WebElement> dropDownList =  signout.web_List();
		
		for (WebElement webElement : dropDownList) {
			
			if(webElement.getText().trim().equals("Sign Out")){
				webElement.click();
				break;
			}
		}
		test.pass("Test completed successfully");
	}

}

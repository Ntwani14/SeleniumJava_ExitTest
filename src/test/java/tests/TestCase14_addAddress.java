package tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageFactory.addAddressPage;

public class TestCase14_addAddress extends BaseClass{

	@Test(groups = {"smoke"},priority = 14,enabled = false)
	public void AddAddress() throws IOException, InterruptedException
	{
		TestCase1_login.loginTest();
		

		ExtentTest test = extent.createTest("TestCase14", "Add Address").assignAuthor("Amuthan").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 84");
		test.log(Status.INFO, "TestCase started");
		
		addAddressPage addAddress = PageFactory.initElements(driver, addAddressPage.class);
		
		addAddress.clickLocationLink();
		
		assert addAddress.validateText();

		addAddress.clickManageAddressLinlText();
		
		Assert.assertEquals(driver.getTitle(), "Your Addresses");
		
		addAddress.btnClickPlusBtn();
		
		addAddress.clickCountryList();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		addAddress.txtEnterAddress("222 NY UNITED STATES 60 E 46TH ST");
	
		addAddress.txtEnterCity("NEW YORK");
		
		addAddress.chooseState();
		 
			List<WebElement> dropDownList = addAddress.country_List();
			
			for (WebElement webElement : dropDownList) {
				
				if(webElement.getText().trim().equals("New York")){
					webElement.click();
					break;
				}
			}
			
			addAddress.ClearData();
			
			addAddress.EnterCode("10017-2518");
		    
		    addAddress.btnSubmit();
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			Assert.assertEquals(driver.getTitle(), "Your Addresses");
			test.pass("Test completed successfully");
			
/*******************************************************************************************************************/		
		
//			driver.findElements(By.xpath(".//*[@role='listbox']/li")).clear();
//			//Select country from drop down list
//			List<WebElement> dropDownList =  driver.findElements(By.xpath(".//*[@role='listbox']/li"));
//			
//			for (WebElement webElement : dropDownList) {
//				
//				if(webElement.getText().trim().equals("South Africa")){
//					webElement.click();
//					break;
//				}
//			}
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.name("address-ui-widgets-enterAddressFullName")).sendKeys("Muhluri Matseke");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressLine1")).sendKeys("Vasco 454, PO BOX 1134");
//		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("20");
//		driver.findElement(By.name("address-ui-widgets-enterAddressCity")).sendKeys("Pretoria");
//		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressStateOrRegion']")).sendKeys("Gauteng");
//		driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']")).sendKeys("0001");
//		driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressPhoneNumber")).sendKeys("0812345678");
//		driver.findElement(By.xpath("//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")).click();
//		driver.findElement(By.xpath("//label[@for='kyc-xborder-radio-skip']//i[@class='a-icon a-icon-radio']")).click();
//		driver.findElement(By.cssSelector("#kyc-collect-form")).click();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		Assert.assertEquals(driver.getTitle(), "Your Addresses");
		
		
	}
}

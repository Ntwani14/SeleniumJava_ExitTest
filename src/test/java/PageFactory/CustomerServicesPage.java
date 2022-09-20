package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerServicesPage {
	
WebDriver driver;
	
	@FindBy(linkText="Customer Service")
	WebElement click_CustomerServiceslinkText;
	
	
	public CustomerServicesPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	public void clickCustomerServiceslinkText() {

		click_CustomerServiceslinkText.click();
	}

}

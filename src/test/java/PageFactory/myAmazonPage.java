package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAmazonPage {
	
	WebDriver driver;
	
	 @FindBy(css ="#nav-your-amazon-text")
	 WebElement click_myAmazonPartialLink;
	
	@FindBy(xpath = "//h2[@class='a-size-large a-spacing-base']")
	WebElement validate;
	
	
	public myAmazonPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	
	public void clickAmazonPartialLink() {

		click_myAmazonPartialLink.click();
	}
	
	public boolean validatePage() {

		return validate.isDisplayed();
	}


}

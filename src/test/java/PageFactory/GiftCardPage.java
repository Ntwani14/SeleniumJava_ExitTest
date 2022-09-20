package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Gift Cards')]")
	WebElement click_giftCardPartialLink;
	
	
	public GiftCardPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	
	public void clickGiftCardPartialLink() {

		click_giftCardPartialLink.click();
	}

}

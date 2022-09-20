package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyAgainPage {
	
	
WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Buy Again')]")
	WebElement click_buyAgainPartialLink;
	
	
	public BuyAgainPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	public void clickBuyAgainPartialLink() {

		click_buyAgainPartialLink.click();
	}



}

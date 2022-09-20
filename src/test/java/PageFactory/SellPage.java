package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SellPage {
	
	WebDriver driver;
	
	@FindBy(linkText="Sell")
	WebElement click_SellLinkText; 
	
	@FindBy(xpath="//h1[contains(text(),'Sell on Amazon')]")
	WebElement validateText; 
	
	public SellPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	
	public void clickSellLinkText() {

		click_SellLinkText.isDisplayed();
	}

	public void validate_byText()
	{
		validateText.click();
	}
}

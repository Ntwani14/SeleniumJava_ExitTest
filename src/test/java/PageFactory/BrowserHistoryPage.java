package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserHistoryPage {
	
WebDriver driver;
	
	@FindBy(xpath="//a[@id='nav-recently-viewed']//span[contains(text(),'Browsing History')]")
	WebElement click_BrowserHistoryLinkText;
	
	
	public BrowserHistoryPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	public void BrowserHistoryLinkText() {

		click_BrowserHistoryLinkText.click();
	}
}

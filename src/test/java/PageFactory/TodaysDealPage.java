package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodaysDealPage {
	
WebDriver driver;
	
	@FindBy(xpath="//a[@href='/gp/goldbox?ref_=nav_cs_gb']")
	WebElement click_todayDealsPartialLink;
	
	
	public TodaysDealPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	
	public void todayDeals() {

		click_todayDealsPartialLink.click();
	}

}

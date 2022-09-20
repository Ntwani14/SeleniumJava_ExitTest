package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class returnOrderPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='& Orders']")
	WebElement lnk_clickLinkText;
	
	public returnOrderPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickLinkText()
	{
		lnk_clickLinkText.click();
	}

}

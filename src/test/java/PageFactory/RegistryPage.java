package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistryPage {
	
	WebDriver driver;
	
	@FindBy(partialLinkText="Regist")
	WebElement click_RegistryLinkText;
	
	
	public RegistryPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	
	public void clickRegistryLinkText() {

		click_RegistryLinkText.click();
	}
}

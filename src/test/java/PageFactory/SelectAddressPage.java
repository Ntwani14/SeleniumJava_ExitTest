package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectAddressPage {
	
	WebDriver driver;
	
	@FindBy(css = "#glow-ingress-line2")
	WebElement click_locationLink;
	
	@FindBy(xpath="//span[contains(text(),'Delivery options and delivery speeds may vary for ')]")
	WebElement validate_Text;
	
	@FindBy(xpath = "//a[normalize-space()='See all']")
	WebElement click_selectAll;
	
	@FindBy(name ="RB5ZQ3U5Y6234WPGFLCEG12WN95JGIHOIA2TIOHIGJ59NWLPXTQ2EQA2OXMN5Y3O:3:lpkklwhspklq")
	WebElement btn_click;
	
	@FindBy(name="glowDoneButton")
	WebElement btn_clickDoneButton;
	
	@FindBy(xpath="//a[@id='nav-global-location-popover-link']")
	WebElement validateTextDispayed;
	
	public SelectAddressPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	
	public void clickLocationLink() {

		click_locationLink.click();
	}

	public void validateText()
	{
		validate_Text.isDisplayed();
	}
	public void clickselectAll()
	{
		click_selectAll.click();
	}
	
	public void buttonClick()
	{
		btn_click.click();
	}
	public void btnClickDoneButton()
	{
		btn_clickDoneButton.click();
	}
	public void validate_TextDispayed()
	{
		validateTextDispayed.isDisplayed();
	}
	

}

package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class deleteAddressPage {
	
	WebDriver driver;
	
	@FindBy(css="#glow-ingress-line2")
	WebElement lnk_clickLocationLinkText;

	@FindBy(xpath="//span[contains(text(),'Delivery options and delivery speeds may vary for ')]")
	WebElement validate_page;
	
	@FindBy(partialLinkText="Manage address bo")
	WebElement lnk_clickPartialLink;
	
	@FindBy(css ="#ya-myab-display-address-block-4")
	WebElement choose_addressToDelete;
	
	@FindBy(xpath="(//a[@id='ya-myab-address-delete-btn-4'])[1]")
	WebElement btn_clickDeleteBtn;
	
	@FindBy(css="span[id='deleteAddressModal-4-submit-btn'] input[type='submit']")
	WebElement btn_clickSubmitButton;

	
	public deleteAddressPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public void clickLocationLinkText()
	{
		lnk_clickLocationLinkText.click();
	}
	public boolean validatePage()
	{
		return validate_page.isDisplayed();
	}
	public void clickPartialLink()
	{
		lnk_clickPartialLink.click();
	}
	
	public void clickDeleteBtn()
	{
		btn_clickDeleteBtn.click();
	}
	public void clickSubmitButton()
	{
		btn_clickSubmitButton.click();
	}

}

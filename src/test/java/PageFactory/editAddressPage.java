package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class editAddressPage {
	
	WebDriver driver;
	
	@FindBy(css="#glow-ingress-line2")
	WebElement lnk_clickLocationLinkText;

	@FindBy(xpath="//span[contains(text(),'Delivery options and delivery speeds may vary for ')]")
	WebElement validate_page;
	
	@FindBy(partialLinkText="Manage address bo")
	WebElement lnk_clickPartialLink;
	
	@FindBy(css="#ya-myab-display-address-block-1")
	WebElement select_addresstoEdit;
	
	@FindBy(css="#ya-myab-address-edit-btn-1")
	WebElement btn_clickEditButton;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement clear_textBox;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement txt_enterName;
	
	@FindBy(css="span[id='a-autoid-0'] input[type='submit']")
	WebElement btn_clickSubmit;
	
	@FindBy(xpath="//label[@for='kyc-xborder-radio-skip']//i[@class='a-icon a-icon-radio']")
	WebElement select_Option;
	
	@FindBy(xpath="//input[@aria-labelledby='kyc-xborder-continue-button-announce']")
	WebElement btn_clickContinueButton;
	
	public editAddressPage(WebDriver driver) {

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
	public void selectAddresstoEdit()
	{
		select_addresstoEdit.click();
	}
	public void btnClickEditButton()
	{
		btn_clickEditButton.click();
	}
	public void clearTextBox()
	{
		clear_textBox.clear();
	}
	public void enterName(String name)
	{
		txt_enterName.sendKeys(name);;
	}
	public void clickSubmit()
	{
		btn_clickSubmit.click();
	}
	public void selectOption()
	{
		select_Option.click();
	}
	public void clickContinueButton()
	{
		btn_clickContinueButton.click();
	}
}

package PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addAddressPage {
	
WebDriver driver;
	
	@FindBy(css="#glow-ingress-line2")
	WebElement click_locationLink;
	
	@FindBy(xpath="//span[contains(text(),'Delivery options and delivery speeds may vary for ')]")
	WebElement validate_Text;
	
	@FindBy(partialLinkText="Manage address bo")
	WebElement click_manageAddressLinlText;
	
	@FindBy(id="ya-myab-plus-address-icon")
	WebElement btn_clickPlusBtn;
	
	@FindBy(xpath="//span[@id='address-ui-widgets-countryCode']//span[@role='button']")
	WebElement click_countryList;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement txt_enterAddress;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
	WebElement txt_enterCity;
	
	@FindBy(xpath="//span[@id='address-ui-widgets-enterAddressStateOrRegion']//span[@role='button']")
	WebElement selectState;
	
	@FindBy(xpath="//ul[@role='listbox']/li")
	List<WebElement> countryList;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement txt_clearData;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement txt_enterCode;
	
	@FindBy(xpath="//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
	WebElement btnSubmit; 
	
	public addAddressPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	public void clickLocationLink() {

		click_locationLink.click();
	}

	public boolean validateText()
	{
		return validate_Text.isDisplayed();
	}
	public void clickManageAddressLinlText()
	{
		click_manageAddressLinlText.click();
	}
	public void btnClickPlusBtn()
	{
		btn_clickPlusBtn.click();
	}
	
	public void clickCountryList()
	{
		click_countryList.click();
	}
	public void txtEnterAddress(String address)
	{
		txt_enterAddress.sendKeys(address);
	}
	public void txtEnterCity(String city)
	{
		txt_enterCity.sendKeys(city);
	}
	public void chooseState()
	{
		selectState.click();;
	}

	public List<WebElement> country_List()
	{
		return countryList;
	}
	
	public void ClearData()
	{
		txt_clearData.clear();
	}
	
	public void EnterCode(String code)
	{
		txt_enterCode.sendKeys(code);
	}
	
	public void btnSubmit()
	{
		btnSubmit.click();
	}
	
}

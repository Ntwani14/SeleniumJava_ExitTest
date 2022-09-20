package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class invalidLoginPage {
	
	WebDriver driver;
	
	@FindBy(partialLinkText = "Hello, sign in")
	WebElement click_signPartialLink;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txt_enterEmail;
	
	@FindBy(id="continue")
	WebElement click_continueButton;
	
	@FindBy(id="ap_password")
	WebElement txt_enterinvalidPassword;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement click_signInSubmitButton;
	
	
	public invalidLoginPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	
	public void clickSignPartialLink() {

		click_signPartialLink.click();
	}

	public void enterEmail(String email) {

		txt_enterEmail.sendKeys(email);
	}

	public void clickContinueButton() {

		click_continueButton.click();
	}

	public void enterPassword(String password) {

		txt_enterinvalidPassword.sendKeys(password);
	}
	
	public void clicksignInSubmitButton()
	{
		click_signInSubmitButton.click();
	}
}

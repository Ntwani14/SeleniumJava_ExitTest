package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class invalidEmailPage{
	
	WebDriver driver;
	
	@FindBy(partialLinkText="Hello, sign in")
	WebElement click_signPartialLink; 
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txt_enterInvalidEmail;
	
	@FindBy(id="continue")
	WebElement click_continueButton;
	
	public invalidEmailPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	public void clickSignPartialLink() {

		click_signPartialLink.click();
	}

	public void enterInvalidEmail(String invalidEmail) {

		txt_enterInvalidEmail.sendKeys(invalidEmail);
	}

	public void clickContinueButton() {

		click_continueButton.click();
	}

}

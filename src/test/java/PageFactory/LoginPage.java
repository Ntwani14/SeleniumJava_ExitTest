package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage{

	WebDriver driver;

	@FindBy(partialLinkText = "Hello, sign in")
	WebElement click_signinButton; 

	@FindBy(xpath = "//input[@name='email']")
	WebElement txt_enterEmail;

	@FindBy(id="continue")
	WebElement btn_clickContinueButton;

	@FindBy(id = "ap_password")
	WebElement txt_password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement btn_clickSigninButton;


	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickSigninPartialLink() {

		click_signinButton.click();
	}

	public void enterEmail(String email) {

		txt_enterEmail.sendKeys(email);
	}

	public void clickContinueButton() {

		btn_clickContinueButton.click();
	}

	public void enterPassword(String password) {

		txt_password.sendKeys(password);
	}

	public void clickSigninButton() {

		btn_clickSigninButton.click();
	}

}

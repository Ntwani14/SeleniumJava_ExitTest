package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchButtonPage {
	
WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement txt_enterText;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement btn_clickSearchButton;
	
	public searchButtonPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	public void enterTextToBeSearched(String text) {

		txt_enterText.sendKeys(text);
	}

	public void clickSearchButton() {

		btn_clickSearchButton.click();
	}

}

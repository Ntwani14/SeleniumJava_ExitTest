package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class addToCardPage {
	
WebDriver driver;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement click_cart;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement txt_enterTextToSearch;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement btn_clickSearchButton;

	
	
	public addToCardPage(WebDriver driver)
	{
		driver = this.driver;
	}
	
	
	public void clickCart() {

		click_cart.click();
	}

	public void enterTextToSearch(String text) {

		txt_enterTextToSearch.sendKeys(text);
	}

	public void clickSearchButton() {

		btn_clickSearchButton.click();
	}

}
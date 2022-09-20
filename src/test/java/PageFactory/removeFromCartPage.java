package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class removeFromCartPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement click_cart;
	
	@FindBy(name ="(submit.delete.C33648bbc-79e9-4463-a59b-5a37561cbd1d")
	WebElement btn_delete;
	
	public removeFromCartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickCart()
	{
		click_cart.click();
	}
	
	public void deleteButton()
	{
		btn_delete.click();
	}
}

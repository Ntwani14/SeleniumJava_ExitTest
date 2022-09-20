package PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signoutPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='nav-al-your-account']/a")
	List<WebElement> webList;
	
	public signoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectElement()
	{
		driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
	}
	
	public List<WebElement> web_List()
	{
		return webList;
	}

}

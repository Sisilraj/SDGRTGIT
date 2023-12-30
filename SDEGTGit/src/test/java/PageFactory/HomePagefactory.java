package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagefactory {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[text()='Swag Labs']")
	WebElement logo_cart;
	
	public HomePagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void isDisplayLogo() {
		logo_cart.isDisplayed();
	}

}

package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginStepsDefinition {
	
//	public static WebDriver driver;
//	
//	@Given("User is on Login page")
//	public void user_is_on_login_page() {
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    
//	}
//
//	@When("User enter valid {string} and {string}")
//	public void user_enter_valid_username_and_password(String username, String password) {
//		
//		driver.findElement(By.id("user-name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	    
//	}
//
//	@And("Click on login button")
//	public void click_on_login_button() {
//		
//		driver.findElement(By.id("login-button")).click();
//		
//	}
//
//	@Then("User is navigate to home page")
//	public void user_is_navigate_to_home_page() {
//	    
//		Assert.assertTrue(driver.findElements(By.xpath("//div[text()='Swag Labs']")).size()>0, "User is navigated to home page");
//		
//	}
//
//	@And("Close the browser")
//	public void close_the_browser() {
//		
//		driver.quit();
//	   
//	}

}

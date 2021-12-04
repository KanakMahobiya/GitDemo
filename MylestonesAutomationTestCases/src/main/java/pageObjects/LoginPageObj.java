package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObj {
	
	public LoginPageObj(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebDriver driver;
	
	private By email= By.cssSelector("#user_email");
	private By password= By.cssSelector("#user_password_signin");
	private By signin= By.id("sign_up_button");
	private By forget= By.cssSelector("a[href*='lost-password']");
	
	
	public WebElement Email() {
		return driver.findElement(email);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement signIn() {
		return driver.findElement(signin);
	}
	
	public WebElement Forget() {
		return driver.findElement(forget);
	}
	
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObj {
	
	public LandingPageObj(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebDriver driver;
	
	private By login= By.xpath("//a[text()='Log In']");
	private By reg= By.xpath("//button[text()='Register']");
	
	
	public WebElement logIn() {
		return driver.findElement(login);
	}
	
	public WebElement Reg() {
		return driver.findElement(reg);
	}
	

}

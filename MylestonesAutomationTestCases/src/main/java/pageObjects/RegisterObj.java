package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterObj {
	
	//button[text()='Register']
	
	
	
	public RegisterObj(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebDriver driver;
	
	private By firstname= By.id("first_name");
	private By lastname= By.id("last_name");
	private By id= By.id("user_email");
	private By pass= By.id("user_password");
	private By singup= By.id("user_sign_up");
	
	
	public WebElement firstName() {
		return driver.findElement(firstname);
	}
	public WebElement lastName() {
		return driver.findElement(lastname);
	}
	public WebElement ID() {
		return driver.findElement(id);
	}
	public WebElement Pass() {
		return driver.findElement(pass);
	}
	public WebElement SingUp() {
		return driver.findElement(singup);
	}

}

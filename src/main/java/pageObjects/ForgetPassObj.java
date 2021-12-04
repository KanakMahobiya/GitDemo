package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPassObj {
	
	public ForgetPassObj(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebDriver driver;
	
	private By eid= By.xpath("//input[@name='user_login']");
	private By reset= By.xpath("//button[@type='submit']");
	
	public WebElement Eid() {
		return driver.findElement(eid);
	}
	
	public WebElement Reset() {
		return driver.findElement(reset);
	}

}

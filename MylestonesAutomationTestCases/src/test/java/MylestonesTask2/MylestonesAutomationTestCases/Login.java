package MylestonesTask2.MylestonesAutomationTestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPageObj;
import pageObjects.LoginPageObj;


public class Login extends base {
	
	@BeforeTest
	public void initaialise() throws IOException {
		
		driver=IntializeDriver();
		driver.get("https://staging.mylestones.com/");
	}
	
	@Test
	public void LoginMethod() {
		LandingPageObj l= new LandingPageObj(driver);
		l.logIn().click();	
		
		LoginPageObj log= new LoginPageObj(driver);
		log.Email().sendKeys("Teste@gmail.com");
		log.Password().sendKeys("Testone123456");
		log.signIn().click();
	}
	@AfterTest
	public void CloseWindow() {
		driver.close();
	}
}

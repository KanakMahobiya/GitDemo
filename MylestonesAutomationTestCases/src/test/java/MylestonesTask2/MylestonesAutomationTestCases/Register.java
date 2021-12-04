package MylestonesTask2.MylestonesAutomationTestCases;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPageObj;
import pageObjects.RegisterObj;

public class Register extends base {

	@BeforeTest
	public void initaialise() throws IOException {
		
		driver=IntializeDriver();
		driver.get("https://staging.mylestones.com/");
	}
	
	@Test
	public void RegistrationMethod() {
		LandingPageObj lr= new LandingPageObj(driver);
		lr.Reg().click();
		
		RegisterObj rlog= new RegisterObj(driver);
		rlog.firstName().sendKeys("Testthree");
		rlog.lastName().sendKeys("Threetest");
		rlog.ID().sendKeys("Testthree@gmail.com");
		rlog.Pass().sendKeys("Testone123456");;;
		rlog.SingUp().click();
		}
	@AfterTest
	public void CloseWindow() {
		driver.close();
	}
	
}


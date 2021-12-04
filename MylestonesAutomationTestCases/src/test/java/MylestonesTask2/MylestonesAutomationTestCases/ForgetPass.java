package MylestonesTask2.MylestonesAutomationTestCases;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ForgetPassObj;
import pageObjects.LandingPageObj;
import pageObjects.LoginPageObj;


public class ForgetPass extends base {
	
	@BeforeTest
	public void initaialise() throws IOException {
		
		driver=IntializeDriver();
		driver.get("https://staging.mylestones.com/");
	}
	@Test
	public void RegistrationMethod() {
		LandingPageObj l= new LandingPageObj(driver);
		l.logIn().click();	
		
		LoginPageObj fr= new LoginPageObj(driver);
		fr.Forget().click();
		
		ForgetPassObj fpo= new ForgetPassObj(driver);
		fpo.Eid().sendKeys("Testone@gmail.com");
		fpo.Reset().click();	
	}
	@AfterTest
	public void CloseWindow() {
		driver.close();
	}
		
}
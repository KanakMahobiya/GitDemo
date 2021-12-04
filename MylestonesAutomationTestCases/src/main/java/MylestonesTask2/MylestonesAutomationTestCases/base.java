package MylestonesTask2.MylestonesAutomationTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver IntializeDriver() throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\91831\\eclipse-workspace\\MylestonesAutomationTestCases\\src\\main\\java\\MylestonesTask2\\MylestonesAutomationTestCases\\data.properties");
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		System.out.println("Running test in Chrome "+browserName);
		
		if(browserName.equals("chrome")) {
			// Initialize Chrome
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91831\\OneDrive\\Documents\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equals("firefox")) {
			// Initialize in firefox
		}
		else if(browserName.equals("IE")){
			// Initialize in IE	
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}

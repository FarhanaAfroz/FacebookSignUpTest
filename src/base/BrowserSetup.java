package base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.WDFunctions;


public class BrowserSetup extends WDFunctions{
	 
	@Parameters("browser")// this annotation is used to insert browser parameter from TestNG xml
	@BeforeMethod //The annotated method will be run before all tests in this suite have run 

		public  void browserInitialize(String browsername){
		
		if(driver == null){
			if(browsername.equalsIgnoreCase("Chrome")){
			
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
				"//drivers//chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				
				// for chrome browser maximizing code
				chromeOptions.addArguments("--start-maximized");
												
				//Create an instance of WebDriver interface by passing parameter
				driver = new ChromeDriver(chromeOptions);

				//driver = new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", 
				System.getProperty("user.dir") + "//drivers//geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else
	        {
	       throw new IllegalArgumentException("The Browser Type is Undefined");
	        }

		}
			
				
	}
	
	@AfterMethod //this annotation would run once test script execution would complete
	  public void BrowserClose()
	    {
	       try {
	            driver.wait(15000);
	            }
	       catch (Exception e){
	             driver.close();
	           }
	    }
}

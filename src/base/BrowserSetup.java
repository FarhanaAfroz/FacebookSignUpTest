package base;


import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.WDFunctions;


public class BrowserSetup extends WDFunctions{
	 
	BaseUrl browserObj = new BaseUrl();
		
	
	public  void Initialize(){
		
		if(driver == null){
			if(browserObj.browser.equalsIgnoreCase("Chrom")){
			
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
				"//drivers//chromedriver.exe");
				//driver = new ChromeDriver();
			}
			else if(browserObj.browser.equalsIgnoreCase("ff")){
				System.setProperty("webdriver.gecko.driver", 
						 System.getProperty("user.dir") + "//drivers//geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
			
				
	}

	
}

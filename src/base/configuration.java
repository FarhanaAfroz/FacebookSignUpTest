package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utilities.WDFunctions;

public class configuration extends WDFunctions {
	
	BaseUrl url = new BaseUrl();
	BrowserSetup brSet = new BrowserSetup();
	public String browser = "Chrom";
	
	@BeforeTest
	public void beforeTest (){
		
		APPLICATION_LOGS.info ("Browser STARTED");
		brSet.browserInitialize(browser);
		APPLICATION_LOGS.info ("Chrome STARTED");
		maxPage();
		APPLICATION_LOGS.info("Browser MAXIMIZE");
		driver.get(url.baseUrl);
		APPLICATION_LOGS.info ("www.facebook.com opened");
	}
	
	@AfterTest
	public void afterTest (){
		//System.out.println("Close the browser");
		APPLICATION_LOGS.info ("Driver got closed");
		// driver.quit();
	}


}

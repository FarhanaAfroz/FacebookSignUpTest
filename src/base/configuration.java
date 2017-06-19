package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.WDFunctions;

public class configuration extends WDFunctions {
	BaseUrl url = new BaseUrl();
	BrowserSetup brSet = new BrowserSetup();
	
	@BeforeTest
	public void beforeTest (){
		
		APPLICATION_LOGS.info ("Browser STARTED");
		brSet.Initialize();
		APPLICATION_LOGS.info ("Chrome STARTED");

	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
	//browser window maximizing
		maxPage();
		driver.get(url.baseUrl);
		APPLICATION_LOGS.info ("www.facebook.com opened");
	}
	
	
	@AfterTest
	public void afterTest (){
		//System.out.println("Close the browser");
		APPLICATION_LOGS.info ("Driver got closed");
		// driver.close();
	}


}

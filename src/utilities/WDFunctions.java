package utilities;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import base.configuration;

public class WDFunctions {
	
	configuration br = new configuration();
	
	public static WebDriver driver;
	public static Logger APPLICATION_LOGS = Logger.getLogger ("devpinoyLogger");
	
	public void typeByXpath (String locators, String values){
		driver.findElement(By.xpath(locators)).clear();
		driver.findElement (By.xpath(locators)).sendKeys (values);

	}

	public void typeByName (String locators, String values){
		driver.findElement(By.name(locators)).clear();
		driver.findElement (By.name(locators)).sendKeys (values);

	}
	public void typeById (String locators, String values){
		driver.findElement(By.id(locators)).clear();
		driver.findElement (By.id(locators)).sendKeys (values);

	}
	
	public void clickByXpath (String locators){
		driver.findElement (By.xpath(locators)).click();

	}
	
		
	public void dropdownByXpath(String locators, String values){
		
		WebElement dd = driver.findElement(By.xpath(locators));
		Select ddSelect = new Select(dd);
		ddSelectByIndex(ddSelect);
	}
	
	public void dropdownById(String locators, String values){
		
		WebElement dd = driver.findElement(By.xpath(locators));
		Select ddSelect = new Select(dd);
		ddSelectByValue(ddSelect, values);	
	}

		
	public  void ddSelectByIndex(Select sValue){
		sValue.selectByIndex(5);

	}
	
	public void ddSelectByValue(Select sValue, String values){
		sValue.selectByValue(values);

	}
	
	public void ddSelectByVisibleText(Select sValue, String values){
		sValue.selectByValue(values);

	}


	public void radioButtonByXpath(String locatorF, String locatorM){
		boolean isSelectedGender = driver.findElement(By.xpath(locatorF)).isSelected();
		if(isSelectedGender)
			driver.findElement(By.xpath(locatorM)).click();
		
		else
			driver.findElement(By.xpath(locatorF)).click();
		
	}
	

	public void maxPage (){
		
		if(br.browser.equalsIgnoreCase("Chrom")){
		//Create an instance of ChromeOption interface	
		ChromeOptions chromeOptions = new ChromeOptions();
											
		// for chrome browser maximizing code
		chromeOptions.addArguments("--start-maximized");
										
		//Create an instance of WebDriver interface by passing parameter
		driver = new ChromeDriver(chromeOptions);
		}
		else if(br.browser.equalsIgnoreCase("Firefox")){
		driver.manage().window().maximize();
		
		}

	}

}

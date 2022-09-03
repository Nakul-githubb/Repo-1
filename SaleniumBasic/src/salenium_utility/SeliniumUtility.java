package salenium_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeliniumUtility {
	public static WebDriver driver = null;
	public static Actions action = null;
	public WebDriverWait wait;

	public WebDriver setUp(String BrowserName, String appUrl) {
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver =new InternetExplorerDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		//maximize 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		wait = new WebDriverWait(driver,20);
		action = new Actions(driver);
		return driver;
	}
	public void performclick(WebElement element) {
		element.click();
	}
	public void typeInput(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	public String getCurrentWorkingDir() {
		String currentDir = System.getProperty("user.dir");
		return currentDir;
	}
	public void copyTextFromField(WebElement element) {
		action.doubleClick(element).perform();;
		element.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	}
	public void pasteTextToField(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}
	public void waitTillElementIsClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public String getValueFromPropertyFile(String fileName, String key) {
		Properties prop= getPropertyFile(fileName);
		return prop.getProperty(key);
	}
	public Properties getPropertyFile(String fileName) {
		String filePath= getCurrentWorkingDir + fileName;
		FileInputStream fis= null;
		try {
			fis = new FileInputStream(filePath);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop =new Properties();
		try {
			prop.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	public void cleanUp() {
		driver.close();
	}
	public void rightClick(WebElement element) {
		action.moveToElement(element).contextClick().build().perform();
	}
	public void mouseHoverWithCord(WebElement element, int x, int y) {
		action.moveToElement(element, x, y).perform();
	}
	public void mouseHover(WebElement element) {
		action.moveToElement(element).perform();
	}
	public void doubleClick(WebElement element) {
		action.moveToElement(element).doubleClick().perform();
	}
//	public void switchToRequiredFrameUsingName(String name) {
//	driver.switchTo().frame(name);
//}
//
//public void switchToRequiredFrameUsingWebElement(WebElement element) {
//	driver.switchTo().frame(element);
//}
//
//public void switchToRequiredFrameUsingIndex(int index) {
//	driver.switchTo().frame(index);
//}
//
//public void switchControlBackToMainPage() {
//	driver.switchTo().defaultContent();
//}
//
//public WebElement getActiveElement() {
//	return driver.switchTo().activeElement();
//}	

	public String getTitle() {
		String appCurrTitle = driver.getTitle();
		return appCurrTitle;
	}
	public int getPageSourceLength() {
		String pageSource= driver.getPageSource();
		int pagSourlength = pageSource.length();
		return pagSourlength;
	}
	public String getCurrentUrl() {
		String url= driver.getCurrentUrl();
		return url;
	}
	public void selectDropByIndex(WebElement element,int num) {
		Select optionDrop = new Select(element);
		optionDrop.selectByIndex(num);
	}
	public void selectDropByValue(WebElement element, String value) {
		Select optionDrop = new Select(element);
		optionDrop.selectByValue(value);
	}
	
	
	
	
}

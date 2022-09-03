package day2.basicoprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeBasicValidation {

	public static void main(String[] args) {

		String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
    //URL validation 
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="demo.actitime.com";
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("URL validation passed");
		}else {
			System.out.println("URL validation failed");
		}
	//Title validation
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Login";
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Tilte validation is passed");
		}else {
			System.out.println("Tilte validation is failed");
		}
	//Page source
		String sourceContent=driver.getPageSource();
		System.out.println("Page source Content lenght is :"+sourceContent.length());
		driver.close();
		
	}

}

package day2.basicoprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookValidation {

	public static void main(String[] args) {

		String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	//URL validation
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="www.facebook.com";
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("Url validation passed");
		}else {
			System.out.println("Url validation is failed");
		}
	//Title validation
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Title validation is passed");
		}else {
			System.out.println("Title validation is failed");
		}
		System.out.println(actualTitle);
		System.out.println("Page Title Lenght :"+actualTitle.length());
	//Page source Content
		String sourceContent=driver.getPageSource();
		System.out.println("Page source Content lenght is :"+sourceContent.length());
		driver.close();
		
			
	}

}

package day2.basicoprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsOprationOnBrowser {

	public static void main(String[] args) {

		String driverPath3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath3);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//expected page url
		String expectedUrl="www.google.com";
		String appCurrentUrl=driver.getCurrentUrl();
		System.out.println("actual url :"+appCurrentUrl);
		System.out.println("expected url is :"+expectedUrl);
		if(appCurrentUrl.contains(expectedUrl)) {
			System.out.println("url validation is passed");
		}else {
			System.out.println("url validation is failed");
		}
		//verify google page title 
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("page title validation is pass");
		}else {
			System.out.println("page title validation is fail");
		}
		//get page source content
		String sourceContent=driver.getPageSource();
		System.out.println("page source content lenght is :"+sourceContent.length());
		driver.close();
		
		
		
		
	}

}

package day2.basicoprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBasicValidation {

	public static void main(String[] args) {
		//get user directory
		String driverPath3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//set executable path
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create instance
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
 	//flipkart page Title varification
		String actualTitle=driver.getTitle();
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("page Title is correct");
		}else {
			System.out.println("page Title validation is failed");
		}
	//validation URL
		String appCurrentUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.flipkart.com";
		System.out.println("actual url is :"+appCurrentUrl);
		System.out.println("expected Url is :"+expectedUrl);
		if(appCurrentUrl.contains(expectedUrl)) {
			System.out.println("url validation is pass");
		}else {
			System.out.println("url validation is fail");
		}
	//Page source content
		String sourceContent=driver.getPageSource();
		System.out.println("Page source content lenght is:"+sourceContent.length());
		driver.close();
		
		
	}

}

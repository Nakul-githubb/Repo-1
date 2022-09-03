package day10.keyboardvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagescroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
	//create body element for scrollling as well as pop up 
		WebElement element = driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		for(int i=0 ; i<10 ; i++) {
			element.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000);
		}
	//for page down to up	
//		for(int i=0 ; i<10 ; i++) {
//			element.sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(1000);
//			element.sendKeys(Keys.PAGE_UP);
//		}
//	
		
		
	}

}

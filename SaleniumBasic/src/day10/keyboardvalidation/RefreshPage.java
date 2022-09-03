package day10.keyboardvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		//driver.navigate().refresh();
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.F5)
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */
		
		
	}

}

package day10.keyboardvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyb1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys(Keys.chord("admin"),Keys.TAB);
		WebDriverWait wait = new WebDriverWait(driver,20);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord("manager"),Keys.ENTER);
		
		
		
		
		
	}

}

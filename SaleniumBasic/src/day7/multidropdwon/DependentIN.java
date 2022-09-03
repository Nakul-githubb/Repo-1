package day7.multidropdwon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependentIN {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	//identify mobile field
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(2000);
	//click on samsung
		driver.findElement(By.xpath("//div[@class='_2d0we9']/div[5]/div/label/div")).click();
		
		WebElement mobileNamePrice = driver.findElement(By.xpath("//div[div[div[text()='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']]]/div[@class=\"_30jeq3 _1_WHN1\"]"));
		System.out.println("mobile name and price :"+mobileNamePrice.getText());		
		
		
		
		
		
		
		
	}

}

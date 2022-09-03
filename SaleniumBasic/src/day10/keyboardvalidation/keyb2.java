package day10.keyboardvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyb2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
	//identify fname
		WebElement fname = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		fname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		fname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	//identify pass
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
	}

}

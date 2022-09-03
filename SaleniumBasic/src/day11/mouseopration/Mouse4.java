package day11.mouseopration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Actions act =new Actions(driver);
	//identify create new account filed
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.click();
		fname.sendKeys("admin");
		//fname.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				//or
		act.moveToElement(fname).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
	//paste last name filed
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
	}

}

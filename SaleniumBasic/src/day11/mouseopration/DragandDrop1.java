package day11.mouseopration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Actions action = new Actions(driver);
		//identify source
		WebElement sourceElement = driver.findElement(By.id("column-a"));
		action.moveToElement(sourceElement).perform();
		WebElement target = driver.findElement(By.id("column-b"));
		action.dragAndDrop(sourceElement, target).build().perform();
//		Thread.sleep(1000);
//		action.dragAndDrop(target, sourceElement).perform();
		
		
	}

}

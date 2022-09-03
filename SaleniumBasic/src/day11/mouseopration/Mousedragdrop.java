package day11.mouseopration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousedragdrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	//frame handling
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);

	//create action class instance and pass browser instance
		Actions act =new Actions(driver);
	//identify sourceElement

		List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target = driver.findElement(By.xpath("//div[@class=\"ui-widget ui-helper-clearfix\"]/div"));

//		act.dragAndDrop(sourceElements.get(0), target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(sourceElements.get(1), target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(sourceElements.get(2), target).build().perform();
//		
		performDragDrop(act,sourceElements.get(1),target);
	}	
		
	static void performDragDrop(Actions act, WebElement src, WebElement target) {
		act.dragAndDrop(src, target).build().perform();
	}

}

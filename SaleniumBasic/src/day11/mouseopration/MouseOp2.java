package day11.mouseopration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOp2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/");
	//identify menu list
		List<WebElement> menu= driver.findElements(By.xpath("//div[@id=\"menu\"]/ul/li/a"));
		System.out.println("get menu option count :"+menu.size());
	
	//create actions class instance and passing required browser instance to its constructor
		Actions act = new Actions(driver);
		//act.moveToElement(menu.get(2)).perform();
		for(int i=0 ;i<menu.size() ; i++) {
			act.moveToElement(menu.get(i)).perform();
			Thread.sleep(1000);
		}
		mouseHoverWithElement(act, menu.get(3));
		rightClick(act, menu.get(1));
		mouseHoverWithCord(act , menu.get(1),100,0);
		mouseHover(act,menu);
	}
	
	static void mouseHoverWithElement(Actions act, WebElement element) {
		act.moveToElement(element).perform();
	}
	static void rightClick(Actions act, WebElement option) {
		System.out.println("option text :"+option.getText());
		act.moveToElement(option).contextClick().build().perform();
	}
	static void mouseHoverWithCord (Actions act, WebElement option, int x, int y) throws InterruptedException {
		System.out.println("get text menu :"+option.getText());
		act.moveToElement(option, x, y).perform();
	}
	static void mouseHover(Actions act, List<WebElement>option) {
		for(int i=0 ; i<option.size() ; i++) {
			System.out.println(option.get(i).getText());
			act.moveToElement(option.get(i)).perform();
		}
	}

}

package day11.mouseopration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoHover {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(" https://www.espncricinfo.com/");
		Actions action = new Actions(driver);
	//identify menu 
		List<WebElement> menuOption =driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']/div/a"));
		System.out.println("No of option are show:"+menuOption.size());
		for(int i=0 ; i<menuOption.size() ; i++) {
			System.out.println(menuOption.get(i).getText());
			action.moveToElement(menuOption.get(i)).perform();
		}
		
		
		
	}

}

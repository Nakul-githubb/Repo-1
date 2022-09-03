package day11.mouseopration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlifkartHover {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		Actions action= new Actions(driver);
	//identify menu field
		List<WebElement> menuOption =driver.findElements(By.xpath("//div[@class=\"_37M3Pb\"]/div/a/div[2]"));
		for(int i=0; i<menuOption.size() ; i++) {
			System.out.println("Name of Menu are :"+menuOption.get(i).getText());
			action.moveToElement(menuOption.get(i)).perform();;
			Thread.sleep(2000);
	}

}
}
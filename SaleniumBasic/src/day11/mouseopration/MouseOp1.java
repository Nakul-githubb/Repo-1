package day11.mouseopration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOp1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
	//identify first name field 
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		fname.click();
		fname.sendKeys("admin");
	//create an instance of Actions class by passing required browser instance to its constructor		
		Actions act = new Actions(driver);
		act.moveToElement(fname).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();;
	//paste in last name filed
		WebElement lname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		act.moveToElement(lname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();;
		
		
	}

}

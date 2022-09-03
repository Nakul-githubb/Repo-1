package day3.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {

		String currentWorkingDir=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", currentWorkingDir);
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	//identified url first
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://opensource-demo.orangehrmlive.com/";
		if(actualurl.contains(expectedurl)) {
			System.out.println("URL verification is passed");
		}else {
			System.out.println("URL verification is failed");
		}
	//verify Title
		String actualTitle=driver.getTitle();
		String expectedTitle="OrangeHRM";
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Orange HRM title is pass");
		}else {
			System.out.println("Orange HRM title is not match");
		}
	//identified username field 
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.clear();
		username.sendKeys("Admin");
	//identified password field
		WebElement password =driver.findElement(By.id("txtPassword"));
		password.clear();
		password.sendKeys("admin123");
	//identified log in button
		WebElement submit= driver.findElement(By.id("btnLogin"));
		submit.click();
		driver.close();
	}

}

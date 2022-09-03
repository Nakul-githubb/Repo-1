package day3.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {

		String currentWorkDir=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", currentWorkDir);
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://demo.actitime.com/login.do");
	//Url verify
		String actualurl=driver.getCurrentUrl();
		String expectedurl="demo.actitime.com";
		if(actualurl.contains(expectedurl)) {
			System.out.println("actitime url is passed");
		}else {
			System.out.println("actitime url is failed");
		}
	//identified username and enter value
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
	//identified password and enter value
		WebElement password = driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
	//identified log in button and enter
		WebElement login= driver.findElement(By.id("loginButton"));
		login.click();
		driver.close();
		
	}

}

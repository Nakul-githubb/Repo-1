package day4.syncronisations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitme {
	public static void main(String[] args) throws InterruptedException {

		String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	//define implicitly method for browser
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Page title fet
		String pageTitle = driver.getTitle();
		System.out.println("Page title is :"+pageTitle);
		System.out.println("Page title length is :"+pageTitle.length());
	//page title validation checks
		String expectedTitle = "actiTIME - Login";
		System.out.println("Log in page validation :"+pageTitle.equals(expectedTitle));
	//Url and log in page validation 
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://demo.actitime.com";
		System.out.println("Url is working or not :"+actualUrl.contains(expectedUrl));
	//Check username field 
		driver.findElement(By.id("username")).sendKeys("admin");
	//Check passsword field
		driver.findElement(By.name("pwd")).sendKeys("manager");
	//click on log in button
		driver.findElement(By.id("loginButton")).click();
	
		//Home page validation
	//explicitly enter wait statement
		
		Thread.sleep(2000);
		String actualHomePageTitle = driver.getTitle();
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";   //here current home page is not match therefor we using static wait method
		System.out.println("Home page validation is :"+actualHomePageTitle.equals(expectedHomePageTitle));
	//logout validation
		driver.findElement(By.id("logoutLink")).click();
	//verify login page 
		System.out.println("verify log in page is :"+pageTitle.equals(expectedTitle));
		driver.close();
		
		
	}

}

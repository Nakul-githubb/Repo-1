package day6.propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executeautomation {

	public static void main(String[] args) {
		
		String drivePath =System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", drivePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demosite.executeautomation.com/Login.html");
	//Url verify 
		String actualUrl = driver.getCurrentUrl();
		String expUrl = "demosite.executeautomation.com/Login.html";
		if(actualUrl.contains(expUrl)) {
			System.out.println("Url is passed");
		}else {
			System.out.println("Url is failed");
		}
	//get Page Title name and Title length
		String pagTitle = driver.getTitle();
		String pagLength = driver.getPageSource();
		System.out.println("Page Title Length is :"+pagLength.length());
		System.out.println("Page Title name is :"+pagTitle);
	//enter username=execution and password =admin
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
	//click on log in 
		driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
	//get Page Title and current url
		String currPagTitile = driver.getTitle();
		System.out.println("current page Title :"+currPagTitile);
		String currUrl = driver.getCurrentUrl();
		System.out.println("current url is :"+currUrl);
	//logout field
		driver.findElement(By.cssSelector("div[id=\"cssmenu\"]>ul>li>a>span:nth-of-type(1)")).click();
		driver.close();
		
	}

}

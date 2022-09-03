package day5.browseropration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonbasic {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
	//get Title 
		String pagTitle = driver.getTitle();
		System.out.println("Page Title is :"+pagTitle);
	//click on menu and search amazon pay
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Amazon Pay");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String currTitle = driver.getTitle();
		System.out.println("current page Title :"+currTitle);
		
		driver.navigate().back();
		String homepagTitle = driver.getTitle();
		if(pagTitle.equals(homepagTitle)) {
			System.out.println("Page Title Validation is passed");
		}else {
			System.out.println("page validatio is failed");
		}
		driver.close();
		
	}

}

package day5.browseropration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserOpration {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
	//creating instance of chrome browser and upcast it to WebDriver interface
		WebDriver driver = new ChromeDriver();
	//implicite wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//maximize window
	    driver.manage().window().maximize();
	//minimize window are not proper method so we are fix it by Set size method
		driver.manage().window().setSize(new Dimension(450, 600));
	//maximize window browser
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println("Forgot your password page url:"+driver.getCurrentUrl());
	//come back log in page
		driver.navigate().back();
		System.out.println("log in page url:"+driver.getCurrentUrl());
	//wont go back again on forgot password page 
		driver.navigate().forward();
		System.out.println("Forgot Page url:"+driver.getCurrentUrl());
	//want to reload and refresh
		driver.navigate().refresh();
	//want go to direct new url
		driver.navigate().to("https://www.google.com");
		
	}

}

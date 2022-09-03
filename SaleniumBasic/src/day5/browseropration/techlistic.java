package day5.browseropration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.techlistic.com/");
	//click on java and validate Title
		driver.findElement(By.cssSelector(".clearboth  .tabs>li:nth-of-type(1)>a:nth-of-type(1)")).click();
		String currpagUrl = driver.getCurrentUrl();
		String expUrl = "https://www.techlistic.com/p/java.html";
		if(currpagUrl.equals(expUrl)) {
			System.out.println("Page Title validation is passed");
		}else {
			System.out.println("Page Title is failed");
		}
		driver.navigate().back();
	//click on salenium 
		driver.findElement(By.cssSelector(".dropdown>a[class=\"dropbtn\"]:nth-of-type(1)")).click();
		String saleniumUrl = driver.getCurrentUrl();
		String expsalUrl = "https://www.techlistic.com/p/selenium-tutorials.html";
		if(saleniumUrl.equals(expsalUrl)) {
			System.out.println("salenium page Title is pass");
		}else {
			System.out.println("salenium page Title is failed");
		}
		driver.navigate().back();
		driver.close();
	}

}

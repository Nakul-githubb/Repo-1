package day6.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMenuCount {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> menunName =  driver.findElements(By.cssSelector("div>div>div:nth-of-type(2)>div>div>div>a>div:nth-of-type(2)"));
		System.out.println("flifkart main menu count are:"+menunName.size());
		System.out.println("Printing all menu in flipkart:");
		for(int i=0 ; i<menunName.size() ; i++) {
			System.out.println(menunName.get(i).getText());
		}
		
		driver.close();
		
		
		
		
	}

}

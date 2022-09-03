package day6.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoMenuCountName {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath= System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		
	//validation of home page
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Live cricket scores, match schedules, latest cricket news, cricket videos";
		if(actualPageTitle.contains(expectedPageTitle)) {
		System.out.println("home page validation is passed");
		}else {
			System.out.println("home page validation is failed");
		}
		//Count and Print main menu option
		Thread.sleep(2000);
		List<WebElement> menuCric =  driver.findElements(By.cssSelector("div#__next>section>section>div:nth-of-type(3)>div>nav a"));
		System.out.println("cric menu count is :"+menuCric.size());
		System.out.println("Menu list are follow :");
		for(int i=0 ; i<menuCric.size() ; i++) {
			System.out.println(menuCric.get(i).getText());
		}
		
		driver.close();
		
		
	}

}

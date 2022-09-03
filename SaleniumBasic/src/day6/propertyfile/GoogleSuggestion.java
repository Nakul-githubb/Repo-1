package day6.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium interview question");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
		System.out.println("Suggestion count is :"+sugg.size());
	//print suggestion in console
		for(int i=0 ; i<sugg.size() ; i++) {
			//WebElement element =sugg.get(i);
			//System.out.println(element.getText());
			//or
			System.out.println(sugg.get(i).getText());
		}
		driver.close();
		
		
	}

}

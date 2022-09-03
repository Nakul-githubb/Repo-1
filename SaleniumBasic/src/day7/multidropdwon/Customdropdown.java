package day7.multidropdwon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		WebDriverWait wait=new WebDriverWait(driver,20);
	//identify dropdown
		WebElement countrydrop = driver.findElement(By.id("bsd1-button"));
		wait.until(ExpectedConditions.elementToBeClickable(countrydrop));
		//identify dropdown list and click on it
		countrydrop.click();
	//identify all the options and store them into List<WebElement>
		List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
	//use size() to get option count
		System.out.println("option count: "+options.size());
	//use for loop to print one by one option
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
			}
		options.get(2).click();
		
	}

}

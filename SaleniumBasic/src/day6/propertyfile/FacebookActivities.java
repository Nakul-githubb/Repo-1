package day6.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookActivities {

	public static void main(String[] args) {
	
	
		String driverPath= System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	//set driver executable path
		System.setProperty("webdriver.chrome.driver", driverPath);
	//create instance
		WebDriver driver = new ChromeDriver();
	//maximize window
		driver.manage().window().maximize();
	//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//get appUrl	
		driver.get("https://www.facebook.com/");
	//check home page validation
		String actualPageTitle=driver.getTitle();
		String expectedPageTitle = "Facebook – log in or sign up";
		if(actualPageTitle.equals(expectedPageTitle)) {
			System.out.println("home page validation is passed");
		}else {
			System.out.println("home page validation is failed");
		}
	//identify create new account button and click on it	
		driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]")).click();
	//identify day field and check it working or not	
		WebElement dayField = driver.findElement(By.id("day"));
		System.out.println("day field are displayed or not :"+dayField.isDisplayed());
		System.out.println("day field are enbaled or not :"+dayField.isEnabled());
		System.out.println("day field are multiSelect or not :"+dayField.isSelected());
	//Print day count and element  	
		List<WebElement> dayNumbers = driver.findElements(By.cssSelector("select#day>option"));
		System.out.println("day field count is :"+dayNumbers.size());
		System.out.println("Print all numbers in day field :");
		for(int i=0 ; i<dayNumbers.size(); i++) {
			System.out.println(dayNumbers.get(i).getText());
		}
	//identify month field and check is working or not 	
		WebElement monthField = driver.findElement(By.id("month"));
		System.out.println("Month field is displyed or not :"+monthField.isDisplayed());
		System.out.println("Month field is Enabled or not :"+monthField.isEnabled());
		System.out.println("Month field is Select or not :"+monthField.isSelected());
	//Print month count and element 
		List<WebElement> monthElement = driver.findElements(By.cssSelector("select#month>option"));
		System.out.println("Month element count is :"+monthElement.size());
		System.out.println("Print Months Element are as follow :");
		for(int i=0 ; i<monthElement.size() ; i++) {
			System.out.println(monthElement.get(i).getText());
		}
	//identify year field 
		WebElement yearField = driver.findElement(By.id("year"));
		System.out.println("Year field are displyed or not :"+yearField.isDisplayed());
		System.out.println("Year field are Functional or not :"+yearField.isEnabled());
		System.out.println("Year field are Select or not :"+yearField.isSelected());
	//Print Year count and Element
		List<WebElement> yearElement = driver.findElements(By.cssSelector("select#year>option"));
		System.out.println("year count is :"+yearElement.size());
		System.out.println("Year Element are print one by one");
		for(int i=0 ; i<yearElement.size() ; i++) {
			System.out.println(yearElement.get(i).getText());
		}
	}

}

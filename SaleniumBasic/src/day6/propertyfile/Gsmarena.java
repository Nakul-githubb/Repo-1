package day6.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
	//validate home page 
		String actualTitle = driver.getTitle();
		String expTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
		if(actualTitle.equals(expTitle)) {
			System.out.println("home page validation passed");
		}else {
			System.out.println("home page validation is failed");
		}
	//get mobile phone name count and name
		List<WebElement> allmobilecount = driver.findElements(By.cssSelector("div .clearfix>ul>li>a"));
		System.out.println("Print all mobile phone count :"+allmobilecount.size());
		System.out.println("Print all mobile name are as follow");
		for(WebElement mobilphone : allmobilecount) {
			System.out.println(mobilphone.getText());
		}
	//click on samsung phone link present in phone finder
		driver.findElement(By.cssSelector("div .clearfix>ul>li:nth-of-type(1)>a")).click();
	//get device count and print on console
		List<WebElement> samsungcount = driver.findElements(By.cssSelector("div .makers>ul>li>a>strong>span"));
		System.out.println("Samsung phone count is :"+samsungcount.size());
		System.out.println("Print all Samsung mobiles are as follows :");
		for(WebElement samsungname :samsungcount) {
			System.out.println(samsungname.getText());
		}
	//check pagination 	
		List<WebElement> pagsamsung = driver.findElements(By.cssSelector("div .nav-pages >a"));
		if(pagsamsung.size() >0) {
			System.out.println("pagination is exists");
		}else {
			System.out.println("pagination is not exists");
		}
	}

}

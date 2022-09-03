package day10.keyboardvalidation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationtesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
	// create instance of wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement fname =driver.findElement(By.xpath("//input[@type='text']"));
		fname.click();
		fname.sendKeys("admin",Keys.chord(Keys.TAB),"admin",Keys.TAB,"adress is empty for now",Keys.TAB,
				"nakulfulapagare@gmail.com",Keys.TAB,"1234567899",Keys.TAB);
		driver.findElement(By.cssSelector("div .col-md-4.col-xs-4.col-sm-4>label:first-child")).click();
		driver.findElement(By.id("checkbox1")).click();
	//identify lang
		Thread.sleep(1000);
		driver.findElement(By.id("msdd")).click();
		List<WebElement> landrop =driver.findElements(By.cssSelector(".ui-autocomplete>li>a"));
		Thread.sleep(2000);
		System.out.println(landrop.size());
		landrop.get(7).click();
		driver.findElement(By.cssSelector("body")).click();
	//identify skill dropdown
		WebElement skilldrop = driver.findElement(By.id("Skills"));
		Select skilloption = new Select(skilldrop);
		List<WebElement> option =skilloption.getOptions();
		System.out.println(option.size());
		skilloption.selectByIndex(4);
	//identify country
		driver.findElement(By.cssSelector(".select2-selection")).click();
		List<WebElement> condrop = driver.findElements(By.cssSelector("ul#select2-country-results>li"));
		condrop.get(5).click();
	//calender handling
		driver.findElement(By.id("yearbox")).click();
		driver.findElement(By.cssSelector("select#yearbox>option:nth-of-type(83)")).click();
		driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")).click();
		driver.findElement(By.xpath("//select[@placeholder=\"Month\"]/option[12]")).click();
		driver.findElement(By.id("daybox")).click();
		driver.findElement(By.xpath("//select[@id='daybox']/option[30]")).click();
	//password
		WebElement pass= driver.findElement(By.id("firstpassword"));
		pass.click();
		pass.sendKeys("Cool@123");
		WebElement confirmpass = driver.findElement(By.id("secondpassword"));
		confirmpass.click();
		confirmpass.sendKeys("Cool@123");
	///sumbit
		
		driver.findElement(By.id("submitbtn")).click();
	}

}

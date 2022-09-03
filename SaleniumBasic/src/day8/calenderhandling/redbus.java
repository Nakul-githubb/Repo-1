package day8.calenderhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
	//identify from field and click on it and pass Pune
		WebElement fromfield = driver.findElement(By.id("src"));
		fromfield.click();
		fromfield.sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".autoFill>li:nth-of-type(2)")).click();
	//identify to field and pass mumbai
		WebElement tofield = driver.findElement(By.id("dest"));
		tofield.click();
		Thread.sleep(2000);
		tofield.sendKeys("Mumbai");
		driver.findElement(By.cssSelector(".autoFill>li:nth-of-type(2)")).click();
	//identify date field
		driver.findElement(By.id("onward_cal")).click();
	//select date 
		driver.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>tr:nth-of-type(7)>td:nth-of-type(2)")).click();
	//click on search
		driver.findElement(By.id("search_btn")).click();
	//select departure after 6pm
		driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li:last-child>label:nth-of-type(1)")).click();
	//select AC checkbox
		driver.findElement(By.xpath("//ul[@class='list-chkbox']/li[3]/label[1]")).click();
	//get name of buses
		List<WebElement> busname = driver.findElements(By.cssSelector("ul.bus-items .travels"));
		for(int i=0 ; i<busname.size() ; i++) {
			System.out.println(busname.get(i).getText());
		}
	//get price of buses
		WebElement busprice = driver.findElement(By.cssSelector("ul.bus-items .seat-fare .fare>span"));
		System.out.println(busprice.getText());

		
		
		
		
		
	}

}

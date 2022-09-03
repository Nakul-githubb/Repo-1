package day8.calenderhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://etrain.info/in");
	//identify from snd pass Pune in sugg.
		Thread.sleep(2000);
		WebElement fromfield = driver.findElement(By.id("tbsfi1"));
		fromfield.click();
		fromfield.sendKeys("Pune");
		driver.findElement(By.xpath("//div[@id=\"suggest_row1\"]/a")).click();
	//identify To field
		WebElement tofield = driver.findElement(By.id("tbsfi3"));
		tofield.click();
		Thread.sleep(2000);
		tofield.sendKeys("Mumbai");
		driver.findElement(By.cssSelector(".ui-autocomplete.ui-menu>div:nth-of-type(3)>a")).click();
	//identify date field
		driver.findElement(By.id("tbsfi4")).click();
		driver.findElement(By.cssSelector(".dptbl.noinnerborder>tbody>tr>td:nth-of-type(3)>input")).click();//next button
		driver.findElement(By.cssSelector(".dptbl.noinnerborder>tbody>tr:nth-of-type(4)>td:nth-of-type(4)>input")).click();
	//identify quota field 
		driver.findElement(By.id("tbsfi5")).click();
	//click on tatkal
		driver.findElement(By.xpath("//select[@id='tbsfi5']/option[@value='TQ']")).click();
	//click on get train button
		driver.findElement(By.id("tbssbmtbtn")).click();
	//get train numbers
		List<WebElement> trainnum =driver.findElements(By.cssSelector(".myTable.data>tbody>tr[ar=\"120\"]>td[class='wd55']>a"));
		System.out.println("Number of train :"+trainnum.size());
	//get number of train
		for(int i=0 ; i<trainnum.size() ; i++) {
			System.out.println(trainnum.get(i).getText());
		}
	//get name of train
		List<WebElement> trainname = driver.findElements(By.cssSelector(".myTable.data>tbody>tr[ar=\"120\"]>td:nth-of-type(2)>a"));
		for(WebElement trainnam : trainname) {
			System.out.println(trainnam.getText());
		}
		System.out.println("***********************************************");
		WebElement quotaSelection=driver.findElement(By.id("tbsfi5"));
		Select quota=new Select(quotaSelection);
		Thread.sleep(3000);
		quota.selectByIndex(1);
		driver.findElement(By.id("tbssbmtbtn")).click();
		
		List<WebElement> trainId=driver.findElements(By.cssSelector("div.trainlist.rnd5 tr>td:first-child>a"));
		System.out.println("Train id found: "+trainId.size());
		List<WebElement> trainName=driver.findElements(By.cssSelector("div.trainlist.rnd5 tr>td:nth-of-type(2)>a"));
		System.out.println("Trains found: "+trainName.size());
		
		for(int i=0;i<trainId.size();i++) {
			System.out.println(trainId.get(i).getText()+" : "+trainName.get(i).getText());
		}
		
		
	}

}

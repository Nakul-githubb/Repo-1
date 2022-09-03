package day8.calenderhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeCalender {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		//username input	
				driver.findElement(By.name("username")).sendKeys("admin");
			//password input	
				driver.findElement(By.name("pwd")).sendKeys("manager");
			//log in field	
				driver.findElement(By.cssSelector("td[id=loginButtonContainer]>a>div")).click();
			//Task field
				Thread.sleep(2000);
				driver.findElement(By.id("container_tasks")).click();
			//click on add new
				driver.findElement(By.cssSelector(".addNewButton")).click();
			//click on new task
				driver.findElement(By.cssSelector(".createNewTasks")).click();
			//click on search field
				driver.findElement(By.cssSelector(".projectSelector  .selectedItem")).click();
			//select flight opration
				driver.findElement(By.cssSelector(".projectSelector .searchItemList>div:nth-of-type(4)")).click();
			//select Enter task name field and Enter Testing
				driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing");
			//click on set deadline 
				driver.findElement(By.xpath("//button[text()='set deadline']")).click();
			//click on next arrow
				driver.findElement(By.cssSelector("a[id='ext-gen99']")).click();
			//click on date slot
				//driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(2)>td:nth-of-type(2)>a")).click();
			//create task
				driver.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button_label")).click();
			//select check box and click
				driver.findElement(By.cssSelector(".createdTasksRowsTable .checkbox ")).click();
			
		
		
	}

}

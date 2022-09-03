package day6.propertyfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeprosele {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com");
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
	//create task
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button_label")).click();
	//select check box and click
		driver.findElement(By.cssSelector(".createdTasksRowsTable .checkbox ")).click();
	//delete task
		driver.findElement(By.cssSelector(".delete")).click();
		driver.findElement(By.cssSelector(" .dialogWithPointerWrapper .submitBtn>div>span:nth-of-type(1)")).click();
	
	}

}

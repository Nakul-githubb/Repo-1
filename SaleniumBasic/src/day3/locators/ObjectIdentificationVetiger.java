package day3.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentificationVetiger {

	public static void main(String[] args) {

		String currentWork=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", currentWork);
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	//type username as admin 
		
		WebElement username=driver.findElement(By.id("username"));
	/*Once webelement identified then you can perform operation using below operation
	 * Operation type -->               type--> sendkeys();
	 *                                  click--> click();
	 *                         exiting delete--> clear():
	 */
	//clear username and fill admin
		username.clear();
		username.sendKeys("admin");
	//identified password field
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Test@123");
	//identified log in field
    	WebElement submit=driver.findElement(By.className("buttonBlue"));
    	submit.click();
		
    	driver.close();
	}

}

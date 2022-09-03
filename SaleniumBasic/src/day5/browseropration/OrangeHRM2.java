package day5.browseropration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM2 {

	public static void main(String[] args) throws InterruptedException {

		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
	//implicite wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	//Log in Page Title
		String appCurrentPageTitle=driver.getTitle();
		String expectedPageTitle = "OrangeHRM";
		System.out.println("check log in page title :"+appCurrentPageTitle.equals(expectedPageTitle));
  //Page title length 
		System.out.println("log in page title :"+expectedPageTitle.length());		
 //Url validation
		String appCurrentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/";
	    System.out.println("check log in url are match :"+appCurrentUrl.equals(expectedUrl));
// page source and there length
	    String pageSource = driver.getPageSource();
	    System.out.println("log in page source length is :"+pageSource.length());
	//username identify
	    Thread.sleep(2000);
	    
	   WebElement userNameInputField =  driver.findElement(By.id("txtUsername"));
	   System.out.println("username input field displyed or not :"+userNameInputField.isDisplayed());
	   System.out.println("username input field Functional or not :"+userNameInputField.isEnabled());
	   String defaultUserNameInput = userNameInputField.getAttribute("name");
	   System.out.println(defaultUserNameInput);
	   System.out.println("default username is match or not:"+defaultUserNameInput.contains("Username"));
	   userNameInputField.clear();
	   userNameInputField.sendKeys("Admin");
	//password field identify
	 WebElement passwordInputField =  driver.findElement(By.id("txtPassword"));
	System.out.println("password field display or not :"+passwordInputField.isDisplayed());
	 System.out.println("password field functional or not :"+passwordInputField.isEnabled());
	String defaultPasswordInputField = passwordInputField.getAttribute("id");
	System.out.println(defaultPasswordInputField);
	System.out.println("password text is check :"+defaultPasswordInputField.contains("Password"));
	passwordInputField.clear();
	passwordInputField.sendKeys("admin123");
	WebElement logInField = driver.findElement(By.name("Submit"));
	System.out.println("Log in button are displayed or not:"+logInField.isDisplayed());
	System.out.println("Log in button are functional or not:"+logInField.isEnabled());
	//System.out.println("Log in button are selected or not:"+logInField.isSelected());
	String logInBttontext = logInField.getAttribute("value");
	System.out.println("log in button text is match or not :"+logInBttontext.equals("LOGIN"));
	logInField.click();
	WebElement welComeField = driver.findElement(By.id("welcome"));
	welComeField.click();
	WebElement logOutField = driver.findElement(By.linkText("Logout"));
	logOutField.click();
	driver.close();
	}

}

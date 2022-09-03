package day4.syncronisations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleniumValidationActitime {

	public static void main(String[] args) throws InterruptedException {

		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
//implicit wait statement
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//identify username field
		WebElement userNameInputField = driver.findElement(By.id("username"));
		System.out.println("username is displyed or not :"+userNameInputField.isDisplayed());
		System.out.println("username is Functional or not :"+userNameInputField.isEnabled());
		userNameInputField.sendKeys("admin");
		
		String defaultuserNameInputField = userNameInputField.getAttribute("placeholder");
		System.out.println("UserName field is :"+defaultuserNameInputField);
		System.out.println("Username field is correct or not :"+defaultuserNameInputField.equals("Username"));
		
//identify passsword field
		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		System.out.println("password is displyed:"+passwordInputField.isDisplayed());
		System.out.println("password is Functional:"+passwordInputField.isEnabled());

		String defaultPasseordInputField = passwordInputField.getAttribute("placeholder");
		System.out.println("Password field are correct or not :"+defaultPasseordInputField.equals("Password"));
		passwordInputField.sendKeys("manager");
		
		WebElement keepMeLogInfield = driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println("keepMeLogInfield are displyed or not :"+keepMeLogInfield.isDisplayed());
		System.out.println("keepMeLogInfield are functioned or not :"+keepMeLogInfield.isEnabled());
		String checkBoxTextName = keepMeLogInfield.getText();
		System.out.println(checkBoxTextName);
		System.out.println("keep me log in button name are match or not :"+checkBoxTextName.equals("Keep me logged in"));
		keepMeLogInfield.click();
//identify log in field
		System.out.println("**********************************");
		WebElement loinInputField = driver.findElement(By.id("loginButton"));
		System.out.println("log in button are displyed or not :"+loinInputField.isDisplayed());
		System.out.println("log in button are functioned or not :"+loinInputField.isEnabled());
	//System.out.println("log in button are selected or not :"+loinInputField.isSelected());
		String loinInputFieldText = loinInputField.getText();
		System.out.println("Log in button are displyed on buttton are correct or not:"+loinInputFieldText.equals("Login"));
		loinInputField.click();
//identify home page by title
		Thread.sleep(2000);
		String homePageTitle = driver.getTitle();
		System.out.println("home page title match or not :"+homePageTitle.equals("actiTIME - Enter Time-Track"));
		
		WebElement logoutButtonField = driver.findElement(By.id("logoutLink"));
		System.out.println("logout button are displyed :"+logoutButtonField.isDisplayed());
		System.out.println("logout button are functional are not :"+logoutButtonField.isEnabled());
		String logoutButtonName = logoutButtonField.getText();
		System.out.println(logoutButtonName);
		System.out.println("logout button name are match are not:"+logoutButtonName.equals("Logout"));
		logoutButtonField.click();
		
		
		
		
		
		
		
		
		
		
	}

}

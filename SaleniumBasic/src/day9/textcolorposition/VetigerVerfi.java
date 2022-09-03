package day9.textcolorposition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VetigerVerfi {

	public static void main(String[] args) {


		/**
		 * Open a browser and enter vtiger application URL 
		 * validate in login page Signin
		 * 			button is displayed in Green color(code) 
		 * 			Signin text size is 16px 
		 * 			Signin text in white color(code) 
		 * 			Forgot Password ? is displayed in Blue color(code)
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	//identify sign in button
		WebElement signbutton = driver.findElement(By.cssSelector("button[type='submit']:first-child"));
		System.out.println("Font color :"+signbutton.getCssValue("color"));
		System.out.println("Font text size :"+signbutton.getCssValue("font-size"));
		System.out.println("Sign in text back ground colour :"+signbutton.getCssValue("background-image"));
	//forgot password field
		WebElement forgotpass = driver.findElement(By.cssSelector("a[class='forgotPasswordLink']"));
		System.out.println("forgot password colour :"+forgotpass.getCssValue("color"));
		
		
	}

}

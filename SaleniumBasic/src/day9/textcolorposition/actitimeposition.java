package day9.textcolorposition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actitimeposition {

	public static void main(String[] args) {
		/**
		 * Open a browser and enter actitime application URL 
		 * click on login button 
		 * validate in error msg "Username or Password is invalid. Please try again." is displayed in red color
		 * position above the username field
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
	//identify log in field
		driver.findElement(By.id("loginButton")).click();
	//identify error msg
		WebElement erromsg = driver.findElement(By.xpath("//td[@valign=\"top\"]/span"));
		System.out.println("Print error msg is :"+erromsg.getText());
		System.out.println("error msg text color are :"+erromsg.getCssValue("color"));
		System.out.println("get error msg size :"+erromsg.getCssValue("font-size"));
	//create point class
		Point locationerrormsg = erromsg.getLocation();
		int errormsgX = locationerrormsg.getX();
		int errormsgY = locationerrormsg.getY();
		System.out.println("error msg x cord:"+errormsgX);
		System.out.println("error msg y cord:"+errormsgY);
	//identify username field
		WebElement username =driver.findElement(By.name("username"));
		Point usernameloc = username.getLocation();
		int usernameX = usernameloc.getX();
		int usernameY = usernameloc.getY();
		System.out.println("username X cord :"+usernameX);
		System.out.println("username Y cord :"+usernameY);
	//validate error msg are located on the username
		System.out.println("error msg are located on usrname :"+(usernameY>errormsgY));
		
		
	}

}

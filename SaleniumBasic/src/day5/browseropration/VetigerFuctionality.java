 package day5.browseropration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VetigerFuctionality {

	public static void main(String[] args) throws InterruptedException {

		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
	//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
//maximize window
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(50,600));
	//url validation
		String appCurrentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("check url validation are true or not :"+expectedUrl.equals(appCurrentUrl));
   //Log in pagae Title 
		String logInPageTitle = driver.getTitle();
		String expectedLofInPageTitle = "vtiger";
		System.out.println("log in page title are true or not:"+expectedLofInPageTitle.equals(logInPageTitle));
//UserName field validation
		WebElement userName = driver.findElement(By.id("username"));
		System.out.println("User Name are display or not :"+userName.isDisplayed());
		System.out.println("User Name are functional or not :"+userName.isEnabled());
		String defaultUserName = userName.getAttribute("placeholder");
		System.out.println("check default username text:"+defaultUserName.equals("Username"));
		userName.clear();
		userName.sendKeys("admin");
//Password filed validation
		WebElement passwordField =driver.findElement(By.id("password"));
		System.out.println("check password field are displyed or not:"+passwordField.isDisplayed());
		System.out.println("check password field are functional or not:"+passwordField.isEnabled());
		String defaultPasswodField = passwordField.getAttribute("placeholder");
		System.out.println("check default password text :"+defaultPasswodField.equals("Password"));
		passwordField.clear();
		passwordField.sendKeys("Test@123");
//Sign in field validation
		WebElement signInfield = driver.findElement(By.className("buttonBlue"));
		System.out.println("Sign In field are displayed or not :"+signInfield.isDisplayed());
		System.out.println("Sign In field are functional or not :"+signInfield.isEnabled());
	//System.out.println("Sign In field are select or not :"+signInfield.isSelected());
		signInfield.click();
		Thread.sleep(2000);
//validation home page
		String homePageTitle = driver.getTitle();
		System.out.println("check home page title :"+homePageTitle.equals("Dashboard"));
//click on add widget and selected any three widget
		WebElement addWidgetbutton = driver.findElement(By.cssSelector(".addButton"));
		addWidgetbutton.click();
	// select history
		driver.findElement(By.cssSelector("a[data-name=\"History\"]")).click();
	//select funnel
		addWidgetbutton.click();
		driver.findElement(By.cssSelector("a[data-name=\"GroupedBySalesPerson\"]")).click();
	//select sale opp.
		addWidgetbutton.click();
		driver.findElement(By.cssSelector("a[data-name=\"PipelinedAmountPerSalesPerson\"]")).click();
	//click on logout button 
		driver.findElement(By.cssSelector(".userName")).click();
		driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
		driver.close();
		
		
	}

}

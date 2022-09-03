package day6.propertyfile;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaPhoneCount {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
	//create instance of browser
		WebDriver driver = new ChromeDriver();
	//maximize screen
		driver.manage().window().maximize();
	//implicite wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//get url
		driver.get("https://www.demoblaze.com/");
		
	//Print sale phone name with price by findelements method
		List<WebElement> deviceName = driver.findElements(By.cssSelector("div#tbodyid h4>a"));
		List<WebElement> devicePrice =  driver.findElements(By.cssSelector("div#tbodyid h5"));
		
		for(int i=0 ; i<deviceName.size() ; i++) {
			System.out.println(deviceName.get(i).getText()+" :"+devicePrice.get(i).getText());
		}
		driver.close();
		
		
		
		
		
		
	}

}

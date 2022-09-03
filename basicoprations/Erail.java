package day2.basicoprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {

		//get current working directory
		String currentWorkingdir=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		String executePath=System.setProperty("webdriver.chrome.driver", currentWorkingdir);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
	
		//URL , Title , Page source validation
		String actualurl=driver.getCurrentUrl();
		String expectedurl="//erail.in";
		if(actualurl.contains(expectedurl)) {           //url verification
			System.out.println("url is passed");
		}else {
			System.out.println("url is failed");
		}
		String actualTitle=driver.getTitle();
		String expectedTitle="Indian Railways Enquiry PNR Status Live Status IRCTC Reservation Seats";
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Page Title validation is pass");
		}else {
			System.out.println("Page Title validation is fail");
		}
		String sourceContent=driver.getPageSource();
		System.out.println("Page source content lenght is :"+sourceContent.length());
		driver.close();
	}
}

package day2.basicoprations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeWithGenericWay {

	public static void main(String[] args) {

		// absolute path
		String driverPath1="D:\\TESTING CLASS\\Automation testing"
				+ "\\WorkspaceBasic\\SaleniumBasic\\Executables\\chromedriver.exe";
		
		//Relative path
		String driverPath2="\\Executables\\chromedriver.exe";
		//or using System.get.property(key,value
		String driverPath3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		
		//using Syste.setproperty set executable path
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create instance
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}

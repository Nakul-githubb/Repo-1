package day2.basicoprations;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {

		//absolute path
		String driver1="D:\\TESTING CLASS\\Automation testing\\WorkspaceBasic\\SaleniumBasic\\Executables\\chromedriver.exe";
		
		//Relative path ---> indicates current working directory
		String driver2="\\Executables\\chromedriver.exe";
		// or using system get method
		String driver3=System.getProperty("user.dir") + driver2;
		//using system.setProperty method set the path
		System.setProperty("webdriver.chrome.driver", driver3);
		
		// create instance of class
		ChromeDriver cdriver=new ChromeDriver();
		
		//driver.get("https://wwww.google.com");
		
	}

}

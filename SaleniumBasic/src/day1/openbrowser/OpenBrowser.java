package day1.openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"D:\\TESTING CLASS\\Automation testing\\WorkspaceBasic\\SaleniumBasic\\Executables\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");

	}

}

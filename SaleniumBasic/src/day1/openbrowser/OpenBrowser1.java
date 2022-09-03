package day1.openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser1 {

	public static void main(String[] args) {
		OpenBrowser1 obj=new OpenBrowser1();
		obj.chrome();
		//obj.firefox();
	}

	public void chrome() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\TESTING CLASS\\Automation testing\\WorkspaceBasic\\SaleniumBasic\\Executables\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
	}
	public void firefox() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\TESTING CLASS\\Automation testing\\WorkspaceBasic\\SaleniumBasic\\Executables\\geckodriver.exe");
	FirefoxDriver fdriver =new FirefoxDriver();
	fdriver.get("https://www.google.com");
	}
	
}

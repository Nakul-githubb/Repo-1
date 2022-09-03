package day2.basicoprations;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {

		//absolute path
		String driverPath1="D:\\TESTING CLASS\\Automation testing\\WorkspaceBasic\\SaleniumBasic\\Executables\\geckodriver.exe";
		//Relative Path
		String driverPath2="\\Executables\\geckodriver.exe";
		//or using System get property
		String driverPath3=System.getProperty("user.dir")+driverPath2;
		//using system.set property set path by key and value
		System.setProperty("webdriver.gecko.driver", driverPath3);
		FirefoxDriver fdiver=new FirefoxDriver();
		
		
	}

}

package day6.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileDataInput {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(".\\TestData\\App.Data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String driverkey=prop.getProperty("driverkey") ;
		String ExecutablePath=prop.getProperty("driverExecutablePath");
		String appUrl =prop.getProperty("appUrl");
		String Username =prop.getProperty("Username");
		String Password =prop.getProperty("Password");
		String ExpectedLoginPageTitle =prop.getProperty("logInPageTitle");
		String loginButtonName =prop.getProperty("buttonName");
		
		System.out.println(driverkey+"\n"+ExecutablePath+"\n"+appUrl+"\n"+Username+"\n"+Password+"\n"+ExpectedLoginPageTitle+"\n"+loginButtonName);
//		String driverPath=System.getProperty("user.dir")+"ExecutablePath";
//		System.setProperty("driverkey", "driverPath");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get(appUrl);
//		
		
		
		
		
	}

}

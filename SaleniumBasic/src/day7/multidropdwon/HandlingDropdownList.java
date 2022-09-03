package day7.multidropdwon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) {

		String driverPath= System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
	//Identify skill field
		WebElement skillelement = driver.findElement(By.id("Skills"));
	//create instance of select class and pass above element
		Select skilloption = new Select(skillelement);
	//check is multiselect
		System.out.println("check skill dropdown is multiselect or not :"+skilloption.isMultiple());
	//check wheather default or already select option
//		WebElement skillcount = skilloption.getFirstSelectedOption();
//		String skillname =skillcount.getText();
//		System.out.println("Already or default name is :"+skillname);
		//or
		System.out.println("Already select or default option :"+skilloption.getFirstSelectedOption().getText());
	//get count using get option
		List<WebElement> option =skilloption.getOptions();
		System.out.println("skill option count is :"+option.size());
		for(int i=0 ; i<option.size() ; i++) {
			System.out.println("Skill Option are as follows :"+option.get(i).getText());
		}
	//selectoption from dropdown
	skilloption.selectByIndex(4);
		System.out.println("Newly selected option is :"+skilloption.getFirstSelectedOption().getText());
	skilloption.selectByValue("Analytics");
		System.out.println("New selected option is :"+skilloption.getFirstSelectedOption().getText());
	skilloption.selectByVisibleText("Certifications");	
		System.out.println("also new selected option is :"+skilloption.getFirstSelectedOption().getText());
		
		
	}

}

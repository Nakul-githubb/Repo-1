package day7.multidropdwon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselecteddropdown {

	public static void main(String[] args) {
		
		String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
	//identify drop down
		WebElement multidrop = driver.findElement(By.id("multiselect1"));
	//create instance of select class and pass above element
		Select multidropdown = new Select(multidrop);
		System.out.println("check dropdown is multiselect or not:"+multidropdown.isMultiple());
	//check default name 
	//	System.out.println("Already select or default name is:"+multidropdown.getFirstSelectedOption().getText());
	//list of element and their count
		List<WebElement> multioption = multidropdown.getOptions();
		System.out.println("option count is :"+multioption.size());
		for(int i=0 ; i<multioption.size() ; i++) {
			System.out.println(multioption.get(i).getText());
		}
	//select option
		multidropdown.selectByIndex(2);
		System.out.println(multidropdown.getFirstSelectedOption().getText());
//		multidropdown.selectByValue("Audi");
//		System.out.println(multidropdown.getFirstSelectedOption().getText());
//		multidropdown.selectByVisibleText("Swift");
//		System.out.println(multidropdown.getFirstSelectedOption().getText());
		//get all the selected options
				List<WebElement> selectCars=multidropdown.getAllSelectedOptions();
				System.out.println("Selected car count: "+selectCars.size());
				
//		selectSkill.deselectAll();
				
	}

}

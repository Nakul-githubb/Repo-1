package day7.multidropdwon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestyearmonthday {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
	//identify yeardropdown
		WebElement yeardrop = driver.findElement(By.id("yearbox"));
	//create Select class instance and pass above element
		Select yeardropdown = new Select(yeardrop);
	//check dropdown is multiselect or not 
		System.out.println("Year drop down is multiselect or not :"+yeardropdown.isMultiple());
	//check already name and default name
		System.out.println("already select name or default name :"+yeardropdown.getFirstSelectedOption().getText());
	//Print count of option and name
		List<WebElement> optiondrop = driver.findElements(By.cssSelector("#yearbox>option"));
		System.out.println("drop down option count is :"+optiondrop.size());
		for(WebElement yrdrop : optiondrop) {
			System.out.println(yrdrop.getText());
		}
	//select option
		yeardropdown.selectByIndex(100);
		System.out.println("selected year is :"+yeardropdown.getFirstSelectedOption().getText());
	//select by value
		yeardropdown.selectByValue("1997");
		System.out.println("select year by value is :"+yeardropdown.getFirstSelectedOption().getText());
		System.out.println("***********Month Start**************");
//identify month field  
		WebElement monthdrop =driver.findElement(By.cssSelector(".ng-invalid-required>div:nth-of-type(11)>div:nth-of-type(2)>select"));
		//create instance of Select class and pass above value
		Select monthdropdown = new Select(monthdrop);
		//check month dropdown is multiselect or not
		System.out.println("check month dropdown is multiselect or not:"+monthdropdown.isMultiple());
		//check default name
		System.out.println("Already or default :"+monthdropdown.getFirstSelectedOption().getText());
		//option count and their name
		List<WebElement> optionmonth = driver.findElements(By.cssSelector(".ng-invalid-required>div:nth-of-type(11)>div:nth-of-type(2)>select>option"));
		System.out.println("month count are :"+optionmonth.size());
		System.out.println("month name are as follows :");
		for(WebElement monthname : optionmonth) {
			System.out.println(monthname.getText());
		}
		monthdropdown.selectByIndex(11);
		System.out.println("selected month is :"+monthdropdown.getFirstSelectedOption().getText());
//identify day field
		WebElement daydrop =driver.findElement(By.cssSelector("select#daybox"));
		//create instance of day drop down and pass above value
		Select daydropdown = new Select(daydrop);
		//check month dropdown is multiselect or not
		System.err.println("check day drop down is multiselect or not :"+daydropdown.isMultiple());
		//check default name
		System.out.println("check default name :"+daydropdown.getFirstSelectedOption().getText());
		//option count and their name
		List<WebElement> optionday =driver.findElements(By.cssSelector("select#daybox>option"));
		System.out.println("count of day number is :"+optionday.size());
		System.out.println("Print all day number are:");
		for(WebElement daynum : optionday) {
			System.out.println(daynum.getText());
		}
		daydropdown.selectByVisibleText("29");
		System.out.println("selected day is :"+daydropdown.getFirstSelectedOption().getText());
	}

}

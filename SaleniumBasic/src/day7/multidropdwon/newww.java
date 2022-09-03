package day7.multidropdwon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import salenium_utility.SeliniumUtility;

public class newww {

	public static void main(String[] args) {

		SeliniumUtility s =new SeliniumUtility();
		WebDriver driver = s.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		s.selectDropByIndex(driver.findElement(By.id("Skills")), 4);
		s.selectDropByValue(driver.findElement(By.id("Skills")), "C");
		
		
		
	}

}

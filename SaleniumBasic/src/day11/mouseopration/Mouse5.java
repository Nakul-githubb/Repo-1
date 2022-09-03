package day11.mouseopration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import salenium_utility.SeliniumUtility;
public class Mouse5 {

	public static void main(String[] args) {
		
		SeliniumUtility m1 =new SeliniumUtility();
		WebDriver driver=m1.setUp("chrome", "https://www.facebook.com/");
		m1.performclick(driver.findElement(By.xpath("//a[text()='Create New Account']")));
		WebElement userNameInputField=driver.findElement(By.name("firstname"));
		m1.typeInput(userNameInputField, "admin");
		m1.copyTextFromField(userNameInputField);
		WebElement lastName=driver.findElement(By.name("lastname"));
		m1.pasteTextToField(lastName);
		
	}

}

package day9.textcolorposition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackgroundColorTextSize {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://courses.letskodeit.com/practice");
	//identify radio button 
		WebElement radiobutt = driver.findElement(By.cssSelector("div#radio-btn-example>fieldset>legend"));
		System.out.println("radio button color :"+radiobutt.getCssValue("color"));
		System.out.println("radio button text size :"+radiobutt.getCssValue("font-size"));
		System.out.println("radio button background colour :"+radiobutt.getCssValue("background"));
		Point radioloc = radiobutt.getLocation();	
		int radioX = radioloc.getX();
		int radioY = radioloc.getY();
	//identify select class example
		WebElement selectclass =  driver.findElement(By.cssSelector("div#select-class-example>fieldset>legend"));
		System.out.println("select class  color :"+selectclass.getCssValue("color"));
		System.out.println("select class text size :"+selectclass.getCssValue("font-size"));
		System.out.println("select class background colour :"+selectclass.getCssValue("background"));
	//identify Multiple Select Example
		WebElement multiselect =  driver.findElement(By.cssSelector("div#multi-select-example-div>fieldset>legend"));
		System.out.println("multiselect class  color :"+multiselect.getCssValue("color"));
		System.out.println("multiselect class text size :"+multiselect.getCssValue("font-size"));
		System.out.println("multiselect class background colour :"+multiselect.getCssValue("background"));
	//identify check box example 
		WebElement checkboxexmp = driver.findElement(By.cssSelector("div#checkbox-example-div>fieldset>legend"));
		System.out.println("Check box examaple class  color :"+checkboxexmp.getCssValue("color"));
		System.out.println("Check box examaple class text size :"+checkboxexmp.getCssValue("font-size"));
		System.out.println("Check box examaple class background colour :"+checkboxexmp.getCssValue("background"));
	//identify switch window example
		WebElement switcchwindo = driver.findElement(By.cssSelector("div#open-window-example-div>fieldset>legend"));
		System.out.println("Switch window examaple class  color :"+switcchwindo.getCssValue("color"));
		System.out.println("Switch window  examaple class text size :"+switcchwindo.getCssValue("font-size"));
		System.out.println("Switch window  examaple class background colour :"+switcchwindo.getCssValue("background"));
		Point switchwindoloc = switcchwindo.getLocation();
		int switcwindowX = switchwindoloc.getX();
		int switchwindowY = switchwindoloc.getY();
	//check radio button on the switch window
		System.out.println("radio button position is on thw switch window :"+(switchwindowY>radioY));
		
		
		
		
	}

}

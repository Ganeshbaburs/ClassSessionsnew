package week4.day1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnAlert {
	public static void main(String[] args) {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//driver.findElement(By.className("Value")).click();
		// Load the url
		// driver.get("http://leaftaps.com/opentaps");
		// another method
		driver.navigate().to("http://leafground.com/pages/Alert.html");
		// maximize the window
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='Alert Box']").click();
//		TargetLocator switchTo = driver.switchTo();
//		switchTo.alert().accept();
		
//		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
			}
	

}








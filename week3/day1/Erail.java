package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		 driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom")
		.sendKeys("MS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo")
		.sendKeys("ATU", Keys.TAB);
		Thread.sleep(5000);
		// interact with web table
		WebElement table = driver
				.findElementByXPath
				("//*[@id='divTrainsList']/table[1]");
		List<WebElement> allRows = table.findElements(
				By.tagName("tr"));
		System.out.println(allRows.size());
		
		
		
		
		
		
		
		
		
	
	}

}











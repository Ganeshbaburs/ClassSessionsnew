package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames	 {
	public static void main(String[] args) {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		// driver.get("http://leaftaps.com/opentaps");
		// another method
		driver.navigate().to("http://jqueryui.com/selectable/");
		// maximize the window
		driver.manage().window().maximize();
		// enter the user name
		
		driver.switchTo().frame("framevalue");
		driver.findElementByXPath("//li[text()='Item 3']").click();
		//driver.switchTo().defaultContent();
//		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
//		driver.switchTo().frame("value");
//		driver.switchTo().parentFrame();
		
	
	
	
	
	
	
	}

}








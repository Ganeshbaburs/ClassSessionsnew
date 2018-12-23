package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static void main(String[] args) {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		// driver.get("http://leaftaps.com/opentaps");
		// another method
		driver.navigate().to("http://leaftaps.com/opentaps");
		// maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		// enter password
		driver.findElementById("password1").sendKeys("crmsfa");
		// click login
		driver.findElementByClassName("decorativeSubmit").click();
		// click CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
//		dropDown.selectByVisibleText("Employee");
//		dropDown.selectByValue("LEAD_PR");
//		dropDown.selectByIndex(1);
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(source);
		// To print all the drop down options
		List<WebElement> allOptions = dropDown.getOptions();
		for (WebElement eachOpt : allOptions) {
			System.out.println(eachOpt.getText());
		}
		int size = allOptions.size();
		dropDown.selectByIndex(size - 1);
		
		
		/*
		WebElement mk = driver.findElementById("market");
		Select dd1 = new Select(mk);
		dd1.selectByIndex(2);
		*/

		
		// To close the browser
		//driver.close();
	}

}








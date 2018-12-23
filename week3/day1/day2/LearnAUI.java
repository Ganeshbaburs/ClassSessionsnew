package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnAUI {
	public static void main(String[] args) throws InterruptedException {
		// Set driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		Actions builder = new Actions(driver);
		WebElement eleElectronics = driver.findElementByXPath("//span[text()='Electronics']");
		builder.moveToElement(eleElectronics).perform();
		//Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement eleApple = driver.findElementByLinkText("Apple");
		wait.until(ExpectedConditions.elementToBeClickable(eleApple)).click();
	}

}















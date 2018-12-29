package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://legacy.crystalcruises.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementByLinkText("GUEST CHECK-IN").click();
        System.out.println(driver.getTitle());
        
       //Handling window
        Set<String> allWin = driver.getWindowHandles();
        List<String> ls = new ArrayList<>();
        ls.addAll(allWin);        
        driver.switchTo().window(ls.get(1)); 
        
        
        
        
        
        System.out.println(driver.getTitle());

        driver.findElementByPartialLinkText("View Of").click();
        
        Set<String> allWins = driver.getWindowHandles();
        List<String> lst = new ArrayList<>();
        lst.addAll(allWins);
        driver.switchTo().window(lst.get(2));  
        System.out.println(driver.getTitle());  



	}
}








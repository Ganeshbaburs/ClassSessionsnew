package challenges;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreean {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");	
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		/*// https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot
		   compile group: 'ru.yandex.qatools.ashot', name: 'ashot', version: '1.5.4'*/
		Screenshot page = new AShot().
				shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		ImageIO.write(page.getImage(),"PNG", new File("./snaps/page.png"));
		Thread.sleep(1000);
		driver.quit();
	}
}


/*Screenshot screenshot = new AShot().takeScreenshot(driver,webElement);
ImageIO.write(screenshot.getImage(),"PNG",new File(./snaps/Element.png"));*/
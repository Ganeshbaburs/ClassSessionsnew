/*package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	ChromeDriver driver;
	@Given("open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("maximize the browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	}
	@And("load the url")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Enter the username as (.*)")
	public void enterUserName(String uname) {
		driver.findElementById("username")
		.sendKeys(uname);
	}
	@And("Enter the password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password")
		.sendKeys(pwd);
	}
	@When("Click on the login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit")
		.click();	
	}
	@Then("verify login is success")
	public void verifyLogin() {
		System.out.println("Success");
	}
	@But("login is fail")
	public void verifyFail() {
		System.out.println("Fail");
	}

























}






*/
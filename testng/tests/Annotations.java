package com.yalla.testng.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.yalla.selenium.api.base.SeleniumBase;

public class Annotations extends SeleniumBase {
  
  @BeforeMethod
  public void beforeMethod() {startApp("chrome", "http://leaftaps.com/opentaps");
	WebElement eleUserName = locateElement("id", "username");
	clearAndType(eleUserName, "DemoSalesManager");
	WebElement elePassword = locateElement("id", "password");
	clearAndType(elePassword, "crmsfa");
	WebElement eleLogin = locateElement("class", "decorativeSubmit");
	click(eleLogin);
  }

  @AfterMethod
  public void afterMethod() {
	  close();
  }

}

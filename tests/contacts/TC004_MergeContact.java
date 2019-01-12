package com.yalla.testng.tests.contacts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.yalla.testng.api.base.Annotations;


public class TC004_MergeContact extends Annotations{
	
	@BeforeTest(groups = "regression")
	public void setData() {
		testcaseName= "TC004_MergeContact";
		testcaseDec = "Merge 2 contacts in leaftaps";
		author      = "Sarath";
		category    = "Smoke";
	}
	
	@Test(groups = "regression")
	public void createContact() throws InterruptedException {		
		click(locateElement("link", "Contacts"));
		click(locateElement("link", "Merge Contacts"));
		
		click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		clearAndType(locateElement("name", "firstName"), "TestLeaf");
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		String sText= getElementText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		clearAndType(locateElement("name", "firstName"), "Demo");
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);		
		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		
		clickWithNoSnap(locateElement("link", "Merge"));
		acceptAlert();
		
		click(locateElement("link", "Find Contacts"));
		clearAndType(locateElement("xpath", "//label[contains(text(),'Contact Id:')]/following::input[1]"), sText);
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");		
	}

}

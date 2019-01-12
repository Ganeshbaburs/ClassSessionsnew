package com.yalla.testng.tests.contacts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.yalla.testng.api.base.Annotations;

public class TC003_DeleteContact extends Annotations{
	
	@BeforeTest(groups = "sanity")
	public void setData() {
		testcaseName= "TC003_DeleteContact";
		testcaseDec = "Search and Delete a contact in leaftaps";
		author      = "Sarath";
		category    = "Smoke";
	}
	
	@Test(groups = "sanity", dependsOnGroups = "smoke")
	public void createContact() throws InterruptedException {
		
		click(locateElement("link", "Contacts"));
		click(locateElement("link", "Find Contacts"));
	
		clearAndType(locateElement("xpath", "(//input[@name='firstName'])[3]"), "TestLeaf");
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		
		String sText = getElementText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		clickWithNoSnap(locateElement("link", "Deactivate Contact"));
		acceptAlert();
		
		click(locateElement("link", "Find Contacts"));
		clearAndType(locateElement("xpath", "//label[contains(text(),'Contact Id:')]/following::input[1]"), sText);
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");		
	}
}

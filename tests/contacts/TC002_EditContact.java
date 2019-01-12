package com.yalla.testng.tests.contacts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.testng.api.base.Annotations;


public class TC002_EditContact extends Annotations{
	
	@BeforeTest(groups = "sanity")
	public void setData() {
		testcaseName= "TC002_EditContact";
		testcaseDec = "Search and Edit a contact in leaftaps";
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
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		
		clearAndType(locateElement("id", "updateContactForm_departmentName"), "IT");
		
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		
		
		
	}

}

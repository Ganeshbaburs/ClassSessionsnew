package com.yalla.testng.tests.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.testng.api.base.Annotations;

public class TC003_DeleteLead extends Annotations{
	@BeforeTest(groups = "sanity")
	public void setData() {
		testcaseName= "TC003_DeleteLead";
		testcaseDec = "Delete the lead in leaftaps";
		author      = "Gayatri";
		category    = "Smoke";
	}
	
	
	@Test(groups = "sanity", dependsOnGroups = "smoke")
	public void deleteLead() throws InterruptedException {
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath","//span[text()='Phone']"));
		clearAndType(locateElement("name", "phoneNumber"), "99"); 
	    click(locateElement("xpath","//button[text()='Find Leads']"));
	    Thread.sleep(1000);
	    String text = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	    click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	    click(locateElement("link", "Delete"));
	    click(locateElement("link", "Find Leads"));
	    clearAndType(locateElement("xpath", "//input[@name='id']"), text);
	    click(locateElement("xpath","//button[text()='Find Leads']"));
	    verifyExactText(locateElement("class","x-paging-info"), "No records to display");
	}
	
}















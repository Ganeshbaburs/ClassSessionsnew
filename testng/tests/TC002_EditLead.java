package com.yalla.testng.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC002_EditLead extends Annotations{
	@BeforeClass
	public void setData() {
		testcaseName= "TC002_EditLead";
		testcaseDec = "Edit the Lead in leaftaps";
		author      = "Gayatri";
		category    = "Smoke";
	}
	@Test
	public void editLead() throws InterruptedException {
		click(locateElement("link", "CRM/SFA"));
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath","//span[text()='Phone']"));
		clearAndType(locateElement("name", "phoneNumber"), "99"); 
	    click(locateElement("xpath","//button[text()='Find Leads']"));
	 /*   Thread.sleep(1000);
	    click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	    click(locateElement("link", "Edit"));
	    clearAndType(locateElement("id","updateLeadForm_companyName"), "TCS");
	    click(locateElement("name", "submitButton"));*/
	
	
	}
	
}








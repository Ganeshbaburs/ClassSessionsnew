package com.yalla.testng.tests.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.testng.api.base.Annotations;

public class TC002_EditLead extends Annotations{
	@BeforeTest(groups = "sanity")
	public void setData() {
		testcaseName= "TC002_EditLead";
		testcaseDec = "Edit the Lead in leaftaps";
		author      = "Gayatri";
		category    = "Smoke";
	}
	/*@Test(dependsOnMethods = {"com.yalla.testng.tests.leads.TC001_CreateLead.createLead2"}
							, alwaysRun = true
									)*/
	@Test(groups = "sanity", dependsOnGroups = "smoke")
	public void editLead() throws InterruptedException {
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








package com.yalla.testng.tests.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.testng.api.base.Annotations;

public class TC004_DuplicateLead extends Annotations{
	
	@BeforeTest(groups = "regression")
	public void setData() {
		testcaseName= "TC001_CreateLead";
		testcaseDec = "Create a new Lead in leaftaps";
		author      = "Gayatri";
		category    = "Smoke";
	}
	
	@Test(groups = "regression")
	public void duplicateLead() throws InterruptedException {
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));
		click(locateElement("xpath","//span[text()='Phone']"));
		clearAndType(locateElement("name", "phoneNumber"), "99"); 
	    click(locateElement("xpath","//button[text()='Find Leads']"));
	    Thread.sleep(1000);
	    String text = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	    click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	    click(locateElement("link", "Duplicate Lead"));
	    click(locateElement("name", "submitButton")); 
	
	
	
	
	
	
	
	
	}
	
}












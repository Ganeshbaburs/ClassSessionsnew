package com.yalla.testng.tests.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.testng.api.base.Annotations;

public class TC005_MergeLead extends Annotations{
	
	@BeforeTest(groups = "regression")
	public void setData() {
		testcaseName= "TC005_MergeLead";
		testcaseDec = "Merge 2 leads in leaftaps";
		author      = "Gayatri";
		category    = "Smoke";
	}
	
	@Test(groups = "regression")
	public void mergeLead() throws InterruptedException {
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));
		click(locateElement("link", "Merge Leads")); 
		click(locateElement("xpath", "//img[@alt='Lookup']"));
		switchToWindow(1);
		clearAndType(locateElement("xpath", "//input[@name='firstName']"), "gopi");
		click(locateElement("xpath","//button[text()='Find Leads']"));
	    Thread.sleep(1000);
	    String text = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	    clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	    switchToWindow(0);
	    click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		clearAndType(locateElement("xpath", "//input[@name='firstName']"), "babu");
		click(locateElement("xpath","//button[text()='Find Leads']"));
	    Thread.sleep(1000);
	    clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	    switchToWindow(0);
	    clickWithNoSnap(locateElement("xpath", "//a[text()='Merge']"));
	    acceptAlert();
	    click(locateElement("link", "Find Leads"));
	    clearAndType(locateElement("xpath", "//input[@name='id']"), text);
	    click(locateElement("xpath","//button[text()='Find Leads']"));
	    verifyExactText(locateElement("class","x-paging-info"), "No records to display");
	}
	
}








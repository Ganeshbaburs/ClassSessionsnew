package com.yalla.testng.tests;

import org.testng.annotations.Test;

public class TC004_DuplicateLead extends Annotations{
	@Test
	public void duplicateLead() throws InterruptedException {
		click(locateElement("link", "CRM/SFA"));
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












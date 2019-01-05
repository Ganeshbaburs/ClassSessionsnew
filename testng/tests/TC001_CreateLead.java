package com.yalla.testng.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC001_CreateLead extends Annotations{
	@BeforeClass
	public void setData() {
		testcaseName= "TC001_CreateLead";
		testcaseDec = "Create a new Lead in leaftaps";
		author      = "Gayatri";
		category    = "Smoke";
	}
	@Test
	public void createLead() {
		click(locateElement("link", "CRM/SFA"));
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Create Lead"));
		clearAndType(locateElement("id", "createLeadForm_companyName"), "TL");
		clearAndType(locateElement("id", "createLeadForm_firstName"), "Koushik");
		clearAndType(locateElement("id", "createLeadForm_lastName"), "Ch");
		click(locateElement("name", "submitButton")); 
	}
	
}








package com.yalla.testng.tests.leads;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yalla.testng.api.base.Annotations;

import utils.DataLibrary;

public class TC001_CreateLead extends Annotations{
	@BeforeTest(groups = "smoke")
	public void setData() {
		testcaseName= "TC001_CreateLead";
		testcaseDec = "Create a new Lead in leaftaps";
		author      = "Gayatri";
		category    = "Smoke";
		excelFileName = "createlead";
	}
	
	//@Test(priority = 1)
//	@Test(invocationCount = 2, invocationTimeOut = 10000)
//	@Test(invocationCount = 2, timeOut = 5000)
//	@Test(invocationTimeOut = 5000)
//	@Ignore
	@Test(groups = "smoke", dataProvider = "fetchData")
	public void createLead2(String cName, String fName, String lName) {
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Create Lead"));
		clearAndType(locateElement("id", "createLeadForm_companyName"), cName);
		clearAndType(locateElement("id", "createLeadForm_firstName"), fName);
		clearAndType(locateElement("id", "createLeadForm_lastName"), lName);
		click(locateElement("name", "submitButton")); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*//	@Test(priority = 2)
//	@Test(enabled = false)
	public void createLead1() {
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Create Lead"));
		clearAndType(locateElement("id", "createLeadForm_companyName"), "TL");
		clearAndType(locateElement("id", "createLeadForm_firstName"), "Koushik");
		clearAndType(locateElement("id", "createLeadForm_lastName"), "Ch");
		click(locateElement("name", "submitButton")); 
	}*/
	
	
	
}








package com.yalla.testng.tests.contacts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.testng.api.base.Annotations;

public class TC001_CreateContact extends Annotations{
	@BeforeTest(groups = "smoke")
	public void setData() {
		testcaseName= "TC001_CreateContact";
		testcaseDec = "Create a new contact in leaftaps";
		author      = "Sarath";
		category    = "Smoke";
	}
	@Test(groups = "smoke")
	public void createContact() {
	
		click(locateElement("link", "Contacts"));
		click(locateElement("link", "Create Contact"));
		clearAndType(locateElement("id", "firstNameField"), "TestLeaf");
		clearAndType(locateElement("id", "lastNameField"), "Gopinath");
		click(locateElement("name", "submitButton"));
		
	}

}

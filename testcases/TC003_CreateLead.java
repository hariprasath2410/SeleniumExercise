package com.leafBot.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.pages.LoginPage;
import com.leafBot.pages.ViewLead;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC003_CreateLead extends ProjectSpecificMethods  {
	
	@BeforeTest
	public void setValues() {
		testCaseName="CreateLead";
		testDescription="Create New Lead by providing Company Name,First name,Last name";
		nodes="Created Lead";
		authors="Hari";
		category="Smoke";
		dataSheetName="TC003";
		}
	@Test(dataProvider="fetchData")
	
	public void createLeaf(String uName,String pwd,String cName,String fName,String lName) {
		
		new LoginPage(driver,node)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA().lead().Mylead().cName(cName).fName(fName).lName(lName).submit()
		.verifyCompName()
		.logout();
		
	}
	
	}

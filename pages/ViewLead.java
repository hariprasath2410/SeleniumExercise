package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class ViewLead extends ProjectSpecificMethods  {
	
	public ViewLead (RemoteWebDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public MyLeadsPage verifyCompanyName() {
		System.out.println("Lead Created Successfully");
		String text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println("Company Name:" +text);
		driver.close();
		return new MyLeadsPage(this.driver, node);
		
}
}

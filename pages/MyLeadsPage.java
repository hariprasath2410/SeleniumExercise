package com.leafBot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class MyLeadsPage extends ProjectSpecificMethods  {
	
	public MyLeadsPage (RemoteWebDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public CreateLead clickCreateLead() {
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		return new CreateLead(this.driver, node);
		
		}
}

package com.leafBot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods  {

	public MyHomePage (RemoteWebDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		//driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage(this.driver, node);
		}
}

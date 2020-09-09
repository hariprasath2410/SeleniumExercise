package com.leafBot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class CreateLead extends ProjectSpecificMethods  {
	
	public CreateLead(RemoteWebDriver driver, ExtentTest node) {
		// TODO Auto-generated constructor stub
	}
	public CreateLead enterCompanyName() {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Syntel");
		return this;
		}
	public CreateLead enterFirstName() {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("HariPrasath");
		return this;
		}
	public CreateLead enterLastName() {
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Kaliyaperumal");
		return this;
		}		
	public ViewLead clickCreateLeadButton() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		return new ViewLead(driver,node);
	
	}
}

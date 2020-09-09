package com.leaftaps.testng.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.ReadExcel;

public class ProjectSpecificMethod {
	//add ChromeDriver driver-driver object as common to the superclass level
	public ChromeDriver driver;
	public String excelFileName;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void openApp(String url,String username,String password)
	{	
		System.out.println("Before Method Started");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("Before Method Ended");
}
	@AfterMethod
	public void closeApp() {
		System.out.println("After Method Started");	
	driver.close();
	System.out.println("After Method Ended");
		
	}

	@DataProvider (name ="ArrayData")
	public String[][] sendData() throws IOException {
		
		String [][] array= ReadExcel.readExcelData(excelFileName);
		return array;
		
		/*
		 * //Create a 2-Dimensional Array String[][] array =new String[2][3]; //pass
		 * data into array array[0][0]="TestLeaf"; array[0][1]="Balaji";
		 * array[0][2]="C";
		 * 
		 * //add one more test data
		 * 
		 * array[1][0]="TestLeaf"; array[1][1]="Hari"; array[1][2]="P";
		 * 
		 * //change void to String[] after typing return array;
		 */		
		
		
	}
}

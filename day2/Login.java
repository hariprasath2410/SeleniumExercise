package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		// To Open the Chrome Browser
		
		//ClassName Obj= new CLassName();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		//To launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//To maximize the browser window
		driver.manage().window().maximize();
		

		//To fetch title of the url
		String title = driver.getTitle();
		System.out.println(title);

		
		//Enter Username--- select findElement and press Ctrl+2 and then L displays below line
		
		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("DemoSalesManager");
		
		//Enter Password--Alternate way of writing password
		//WebElement elePassword = driver.findElementById("password");
		//elePassword.sendKeys("");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		 //Click Login button
		driver.findElementByClassName("decorativeSubmit").click();	
		
		//click on CRMSFA
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click on Leads tab
		driver.findElementByLinkText("Leads").click();
		
		//click on create lead
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Intellect");
		
		//Enter Firstname
		driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
		
		//Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Prasath");
		
		//Click on Create Lead
		driver.findElementByClassName("smallSubmit").click();
		
		//Click Logout button
		driver.findElementByLinkText("Logout").click();
		//driver.findElementByClassName("decorativeSubmit").click();
		//To close the browser
		//driver.close();
		
	}

}

package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment2 {

	public static void main(String[] args) {
		
		//TO open Chrome
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		//TO launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//To maximize the window
		driver.manage().window().maximize();
				

		//To fetch title of the url
				String title = driver.getTitle();
				System.out.println(title);
				
		//Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				
		//Enter Username
			WebElement eleUsername = driver.findElementById("username");
			eleUsername.sendKeys("DemoSalesManager");
			
		//Enter Password
			driver.findElementById("password").sendKeys("crmsfa");
			
		//Click Login Button
			driver.findElementByClassName("decorativeSubmit").click();
			
			//Wait 30 seconds
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Click CRM/SFA link
			driver.findElementByLinkText("CRM/SFA").click();
			
			//Wait 30 seconds
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Click on Accounts tab
			driver.findElementByLinkText("Accounts").click();

			//Click on Create Account
			driver.findElementByLinkText("Create Account").click();
			
			//Enter Accountname field
			driver.findElementByClassName("inputBox").sendKeys("Infrastructure");
			
			//Enter LocalName
			driver.findElementById("groupNameLocal").sendKeys("PRASATH");

			//Enter SiteName
			driver.findElementById("officeSiteName").sendKeys("MAVERICK");
			
			//Enter Annual Revenue field
			driver.findElementById("annualRevenue").sendKeys("1000000");
			
			//Create Account
			driver.findElementByClassName("smallSubmit").click();
			
			//Close
			//driver.close();
	}

}

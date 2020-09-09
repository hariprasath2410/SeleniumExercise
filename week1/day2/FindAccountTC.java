package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccountTC {

	public static void main(String[] args) throws InterruptedException {
		
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
			eleUsername.sendKeys("DemoCSR");
			
		//Enter Password
			driver.findElementById("password").sendKeys("crmsfa");
			
		//Click Login Button
			driver.findElementByClassName("decorativeSubmit").click();
			
			//Wait 30 seconds
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Click CRM/SFA link
			driver.findElementByLinkText("CRM/SFA").click();
			
			//Wait 30 seconds
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Click on Accounts tab
			//driver.findElementByLinkText("Accounts").click();

			//Click on Find Accounts tab
			//driver.findElementByLinkText("Find Accounts").click();
			
			//CLick on Leads tab
			driver.findElementByXPath("//*[text()='Leads']").click();
			
			//Click on FindLeads tab
			driver.findElementByXPath("(//*[text()='Find Leads'])[1]").click();
			
			//Enter Firstname
			driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hari");
			
			//Enter Find Leads button
			driver.findElementByXPath("(//*[text()='Find Leads'])[3]").click();
			
			Thread.sleep(3000);
			
			//click on the record
			
			driver.findElementByLinkText("Hari Prasad").click();
	}

}

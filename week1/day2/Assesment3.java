package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment3 {

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

					//Click on Find Accounts tab
					driver.findElementByLinkText("Find Accounts").click();
					
					//Enter AccountName
					driver.findElementById("ext-gen27").sendKeys("Credit Limited Account");
					
					//Click on FindAccounts
					driver.findElementByXPath("//*[@id=\"ext-gen110\"]").click();
					
					//Click on displayed account
					driver.findElementByLinkText("Credit Limited Account").click();
					
					//Click on Edit button
					driver.findElementByLinkText("Edit").click();
					
					//Get the Text
					System.out.println(driver.findElementByXPath("//*[@id=\"accountName\"]").getText());
					
					//Get the text description
					System.out.println(driver.findElementByName("description").getText());
					
					//to get the Title
					String title1 = driver.getTitle();
					System.out.println(title1);
					
					
					//Wait 30 seconds
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
					//close the browser
					driver.close();
	}

}

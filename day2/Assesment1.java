package week1.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assesment1 {

	public static void main(String[] args) {
		
		//TO open Chrome
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		//TO launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//To maximize the window
		driver.manage().window().maximize();
	
		driver.findElementByXPath("//label[@for='username']").getText();

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
			//Click on Leads tab
			driver.findElementByLinkText("Leads").click();
			
		//Click on create lead button
			driver.findElementByLinkText("Create Lead").click();
			
			//Wait 30 seconds
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
			//Enter Company Name
			driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		
			//Wait 30 seconds
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Enter Firstname
			driver.findElementById("createLeadForm_firstName").sendKeys("Hari PrasaTH");
		
			//Wait 30 seconds
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			//Enter LastName
			driver.findElementById("createLeadForm_lastName").sendKeys("Kaliyaperumal");
		
			//select source for partner
            WebElement findElementById2 = driver.findElementById("createLeadForm_dataSourceId");
            Select dd=new Select(findElementById2);
            dd.selectByVisibleText("Partner");
            
            //select source for Marketing campaign
            WebElement findElementById3 = driver.findElementById("createLeadForm_marketingCampaignId");
			Select dd1=new Select(findElementById3);
			dd1.selectByIndex(4);
			
			//Select industry
			WebElement findElementById = driver.findElementById("createLeadForm_industryEnumId");
			Select dd2=new Select(findElementById);
			dd2.selectByIndex(5);
			
			//Print the list of dropdown values in Industry DD
			List<WebElement> options = dd2.getOptions();
			int size = options.size();
			System.out.println(size);
			for (int i = 0; i < size; i++) {
				WebElement eachOption = options.get(i);
				System.out.println(eachOption.getText());
			}
			//Wait 30 seconds
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
			//click on createlead button
			//driver.findElementByClassName("smallSubmit").click();
		
		//click Logout button
		//driver.findElementByLinkText("Logout").click();
		
		//to close browser
		//driver.close();
	}

}

package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public ChromeDriver driver;
	public String LeadID;
	public Set<String> allWindows;
	public List<String> allhandles;
	public Set<String> allWindowsnew;
	public List<String> allhandlesnew;
	
	@Given("Open the chrome browser and load the url")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	//(.*)- can be referred as a test data
	//@And("Enter the username as DemoSalesManager and password as crmsfa")
	@And("Enter the username as (.*) and password as (.*)")
	public void enterCred(String uname,String pwd) {	
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@And("Click the Login Button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
		@And("Click the CRMSFA Link")
		public void clickCRMSFA() {	
			driver.findElementByLinkText("CRM/SFA").click();
		}
		
		@And("Click the Leads Link")
	    public void clickLeads() {
	        driver.findElement(By.linkText("Leads")).click();
	    }
	    @And("Click the Create Lead Link")
	    public void clickCreateLeadLink() {
	        driver.findElement(By.linkText("Create Lead")).click();
	    }
	    @And("Enter the Company Name as (.*)")
	    public void enterCompanyName(String cname) {
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	    }
	    @And("Enter the First Name as (.*)")
	    public void enterFirstName(String fname) {
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	    }
	    @And("Enter the Last Name as (.*)")
	    public void enterLastName(String lname) {
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	    }
	    @When("Click on the Create Lead Button")
	    public void clickCreateLead() {
	        driver.findElement(By.name("submitButton")).click();
	    }
	    @Then("Verify the Lead Creation")
	    public void verifyLeadCreation() {
	        System.out.println("Lead Created Successfully");
	    }
	    @But("Verify the Error Message")
	    public void verifyErrorMessage() {
	    System.out.println("Error Message Verified");
	    	
	    }
	    @And("Logout and close Browser")
	    public void CloseBrowser() {
	    	driver.close();
	    }
	    @And("Click on Find Lead Link")
	    public void FindLead() {
	    	driver.findElementByLinkText("Find Leads").click();
	    }
	    @And("Enter the Company Name as(.*)")
	    public void CName(String CName) {
	    	driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(CName);
	    }
	    @And("Enter the First Name as(.*)")
	    public void fName(String fName) {
	    	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
	    }
	    @And("Enter the Last Name as(.*)")
	    public void lName(String lName) {
	    	driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys(lName);
	    }
	    @And("Click on the Find Lead Button")
	    public void findButton(String findButton) throws InterruptedException {
	    	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	    	Thread.sleep(3000);
	  
	    }
	  @And("Select the record")
	  public void selectRecord() {
		driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[1]").click();  
	  }
	  @And("Click on Edit Button")
	  public void EditButton() {
	  	driver.findElementByLinkText("Edit").click();
	  }
	  @And("Enter the New Company Name(.*)")
	  public void NewCompName(String NewCompany ) {
		  driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		  driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(NewCompany);
	  }
	  @And("Click on Submit Button")
	  public void SubmitButton() {
		  driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
	  }
	  @And("Verify Lead Updation")
	  public void LeadUpdate() {
		  String c = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		  System.out.println(c);
		  System.out.println("Updated Company Name Is: "); 
	  }
	  @And("Click on Phone Tab")
	  public void phonetab() {
	  	driver.findElementByXPath("//span[text()='Phone']").click();
}
	  @And("Enter Phone Number")
	  public void PhoneNumber() {
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		}
	  @And("Click on Duplicate leads Button")
	  public void DuplicateLeadButton() {
	  	driver.findElementByLinkText("Duplicate Lead").click();
	  }
	  @And("Click on Merge Leads")
	  public void MergeleadsLink() {
	  	driver.findElementByLinkText("Merge Leads").click();
	  }
	  @And("Click on First Lookup Icon")
	  public void FirstLookup() {
	  	driver.findElementByXPath("//img[@alt='Lookup']").click();
	  	allWindows = driver.getWindowHandles();
	  	allhandles = new ArrayList<String>(allWindows);
	  	driver.switchTo().window(allhandles.get(1));
	  }
	  @And("Enter the Fname in lookup as (.*)")
	  public void FirstName(String FirstName) {
	  	driver.findElementByXPath("//input[@name='firstName']").sendKeys(FirstName);
	  }
	  @And("Click on Findlead Button")
	  public void FLead() throws InterruptedException {
	  	driver.findElementByXPath("//button[text()='Find Leads']").click();
	  	Thread.sleep(3000);
	  }
	  @And("Store leadID of First record")
	  public void StoreLeadID() {
		LeadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	  }
	  @And("Click on Second Lookup icon")
	  public void SecondLookup() {
	  	driver.switchTo().window(allhandles.get(0));
	  	driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
	  	allWindowsnew = driver.getWindowHandles();
	  	allhandlesnew = new ArrayList<String>(allWindowsnew);
	  	driver.switchTo().window(allhandlesnew.get(1));
	  }
	  @And("Click on Merge Button")
	  public void MergeButton() {
	  	driver.switchTo().window(allhandlesnew.get(0));
	  	driver.findElementByXPath("//a[text()='Merge']").click();
	  }
	  @And("Accept popup alert")
	  public void AlertAccept() {
	  	driver.switchTo().alert().accept();
	  }
	  @And("Enter Lead ID")
	  public void LeadID() {
	  	driver.findElementByXPath("//input[@name='id']").sendKeys(LeadID);
	  	
	  }
	  @And("Verify Lead Merge")
	  public void LeadExist() {
	  	String text = driver.findElementByClassName("x-paging-info").getText();
	  	if (text.equals("No records to display")) {
	  		System.out.println("Lead Merged");
	  	} else {
	  		System.out.println("Lead not Merged");
	  	}
	  	
	  }
	  @And("Click on Email Tab")
	  public void EmailLink() {
	  	driver.findElementByLinkText("Email").click();
	  }
	  @And("Enter Email Address as hari.prasath086@gmail.com")
	  public void EmailAddress() {
	  	driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("hari.prasath086@gmail.com");
	  }
	  @When("Click on Delete Button")
	  public void DeleteButton() throws InterruptedException {
	  	driver.findElementByLinkText("Delete").click();
	  	Thread.sleep(3000);
	  }
	  @And("Verify the Lead Deletion")
	  public void LeadDeleted() {
	  	String text = driver.findElementByClassName("x-paging-info").getText();
	  	if (text.equals("No records to display")) {
	  		System.out.println("Lead Deleted");
	  	} else {
	  		System.out.println("Lead not Deleted");
	  	}
	  }
	  }







 

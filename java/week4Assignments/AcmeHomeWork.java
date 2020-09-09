package week4Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeHomeWork {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//enter username
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		//enter password
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		//Interact with webelement
		WebElement mh = driver.findElementByXPath("//button[text()=' Vendors']");
		//Declare Actions class
		Actions builder = new Actions(driver);
		builder.moveToElement(mh).perform();
		//clickonsearchvendor
		WebElement sv = driver.findElementByXPath("//a[text()='Search for Vendor']");
		sv.click();
		//enter vendorname
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
		//click on searchbutton
		driver.findElementByXPath("//button[text()='Search']").click();
		//find the country name based on vendor.
		WebElement table = driver.findElementByXPath("//td[text()='France']");
		System.out.println(table.getText());
		//System.out.println("Country Name for Blue Lagoon Vendor is:"+table);
		//find the country with entire table details
		//WebElement table1 = driver.findElementByXPath("//table[@class='table']");
		//System.out.println(table1.getText());
		//click Logout
		driver.findElementByXPath("//a[text()='Log Out']").click();
		driver.close();
		

		
	}

}

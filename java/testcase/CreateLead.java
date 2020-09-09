package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.testng.base.ProjectSpecificMethod;


	public class CreateLead extends ProjectSpecificMethod{
	
		@BeforeTest
		public void setData() {
			excelFileName ="TC001";
		}
	@Test(dataProvider="ArrayData")
	public void TC001(String cName,String fName,String lName) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.out.println("@Test Method Started");

		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
		System.out.println("@Test Method Ended");
}
}







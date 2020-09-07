package pomdesignpages;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;

import com.leaftaps.testng.base.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod  {
	
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
		return new ViewLead();
	
	}
}

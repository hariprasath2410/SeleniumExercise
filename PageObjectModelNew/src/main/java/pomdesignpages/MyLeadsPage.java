package pomdesignpages;

import org.openqa.selenium.By;

import com.leaftaps.testng.base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod  {
	public CreateLead clickCreateLead() {
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		return new CreateLead();
		
		}
}

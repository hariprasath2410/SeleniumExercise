package pomdesignpages;

import org.openqa.selenium.By;

import com.leaftaps.testng.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod 
{
	public void clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.xpath("//a[text()[normalize-space()='CRM/SFA']]")).click();
		return new MyHomePage();
		
		}
}

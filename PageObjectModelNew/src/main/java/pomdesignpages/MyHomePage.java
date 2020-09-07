package pomdesignpages;

import org.openqa.selenium.By;

import com.leaftaps.testng.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod  {
	public MyLeadsPage clickLeads() {
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		//driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
		}
}

package pomdesignpages;

import com.leaftaps.testng.base.ProjectSpecificMethod;

public class ViewLead extends ProjectSpecificMethod  {
	public MyLeadsPage verifyCompanyName() {
		System.out.println("Lead Created Successfully");
		String text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println("Company Name:" +text);
		driver.close();
		return new MyLeadsPage();
		
}
}

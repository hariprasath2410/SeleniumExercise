package pomdesigntestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.leaftaps.testng.base.ProjectSpecificMethod;

import pomdesignpages.LoginPage;

public class TC001_CreateLead extends ProjectSpecificMethod {
	//@Parameters({"username","password"})
	@Test
	public void runCreateLead() 
	{
	//LoginPage page= new LoginPage();
	new LoginPage()
	.enterUsername()
	.enterPassword()
	.clickLogin()
	.clickCRMSFA()
	.clickLeads()
	.clickCreateLead()
	.enterCompanyName()
	.enterFirstName()
	.enterLastName()
	.clickCreateLeadButton()
	.verifyCompanyName();



	

	
	
	
	
	
	
	
	
	
	}
}

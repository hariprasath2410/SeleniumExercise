package pomdesignpages;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;

import com.leaftaps.testng.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod  {
	
public LoginPage enterUsername() {
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//Create an object for LoginPage
	return this;
	
	
}
	
public LoginPage enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//LoginPage page= new LoginPage();
	//return page;
	return this;
	//this-new LoginPage();
}
public HomePage clickLogin() {
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	//HomePage page= new HomePage();
	//return page;
	return new HomePage();
}

}

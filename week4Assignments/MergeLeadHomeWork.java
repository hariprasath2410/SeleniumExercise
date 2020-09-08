package week4Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeadHomeWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//div[@id='label']").click();
		driver.findElementByXPath("//a[text()='Contacts']").click();
		driver.findElementByXPath("//a[text()='Merge Contacts']").click();
		//click on Fromcotact widget
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> windowHandle1 = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandle1);
		driver.switchTo().window(list.get(1));
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(list.get(0));
		
		Thread.sleep(3000);
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(windowHandle2);
		driver.switchTo().window(list2.get(1));
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		driver.switchTo().window(list2.get(0));
		
		//Thread.sleep(3000);
		
		driver.findElementByXPath("//table[@name='ComboBox_partyIdTo']/following-sibling::a").click();
		Set<String> toWindowHandles = driver.getWindowHandles();
		List<String> toList = new ArrayList<String>(toWindowHandles);
		String toCurrentWindow = toList.get(0);
		String toDesrireWindow = toList.get(1);
		driver.switchTo().window(toDesrireWindow);
		System.out.println(driver.getTitle());
		
		 driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		 //Accept the alert
		 Alert alert = driver.switchTo().alert();
		 String text = alert.getText();
		 System.out.println(text); 
		 alert.accept();
		 //verify the title
		 String title = driver.getTitle();
		 System.out.println(title);
		 
	}

}

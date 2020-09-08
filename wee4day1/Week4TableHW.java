package wee4day1;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week4TableHW {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List allCols = driver.findElementsByXPath("//table//tr/td");
		System.out.println("count of no. of. Columns: "+allCols.size());
		
		List<WebElement> wtElements = driver.findElementsByXPath("//table//tr");
		System.out.println("count of no. of rows: "+wtElements.size());
		
		String progress = driver.findElementByXPath("(//td[text()='Learn to interact with Elements']/following-sibling::td)[1]").getText();
		System.out.println("Progress valud of 'Learn to interact with Elements': "+progress);
		
		
		if(!driver.findElementByXPath("(//td[text()='Learn to interact using Keyboard, Actions']/following-sibling::td)[2]/input").isSelected()) {
			driver.findElementByXPath("(//td[text()='Learn to interact using Keyboard, Actions']/following-sibling::td)[2]/input").click();	
		}else {
			System.out.println("Vital Role checkbox of 'Learn to interact using Keyboard, Actions' is already selected");


	}

}
	
}

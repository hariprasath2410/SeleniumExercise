package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter From station
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("SBC",Keys.TAB);
		
		//Enter to station	
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MAS",Keys.TAB);
		
		WebElement chk = driver.findElementById("chkSelectDateOnly");
		if (chk.isSelected()) {
			chk.click();
		}
		
		//Step1: Find Webelement
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		//Step2:Find all the rows in the specific table element
		//driver.findElementsByTagName("tr");
		
		//table-Webobject (Press Ctrl+2+L (
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		//Step 3:get the count of rows
		int rows_count=allRows.size();
		System.out.println(rows_count);
		
		//Step 4: Pick the first rows in tr list
		
		WebElement firstRow = allRows.get(1);
		for (int i = 1; i <allRows.size(); i++) {
		
		}
		
		//Step 5
		List<WebElement> allColumn = firstRow.findElements(By.tagName("td"));
		
		//step 6:
		int columns_count = allColumn.size();
		System.out.println(columns_count);
		
		//step 7:
		WebElement sec_column = allColumn.get(1);
		
		//Step 8:fetch the train name and display all Train Names alone.
		String trainName = sec_column.getText();
		System.out.println(trainName);
		ArrayList<String>a1 = new ArrayList<String>();
		for (int i = 0; i <allRows.size(); i++) {
			a1.add(sec_column.getText());
			System.out.println(a1);
		}
		
		
	}

}

package wee4day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTableNew {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//launch the url
		driver.navigate().to("http://leafground.com/pages/table.html");
		//implicitly wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  //maximize the browser
		  driver.manage().window().maximize();
		  //use driver.findElement(By.id) and then press ctrl+2+L
		  WebElement eleTable = driver.findElement(By.id("table_id"));
		  //From the table,find the rows
		  List<WebElement> allRows = eleTable.findElements(By.tagName("tr"));
		 System.out.println("No of rows available in table:"+allRows.size());
		 //iterate over rows
		 for (int i = 0; i < allRows.size(); i++) {
			 WebElement eachRow = allRows.get(i);
			 List<WebElement> allCols = eachRow.findElements(By.tagName("td"));
			 for (int j = 0; j < allCols.size(); j++) {
				WebElement cell = allCols.get(j);
				System.out.println(cell.getText()+"\t");
			}
			 
			 {
				
			}
		}
		 	
		 
		// System.out.println("No of columns available in table:"+allCols.size()); 
		
		}

	}



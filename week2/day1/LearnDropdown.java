package week2.day1;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//To launch URL
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//To maximize the browser window
		driver.manage().window().maximize();
		

		//To fetch title of the url
		String title = driver.getTitle();
		System.out.println(title);

		WebElement dropdown = driver.findElementById("dropdown1");
		
		//Deal with dropdown- Select
		
		
		//Convert the webelement to dropdown (select)
		
		Select dd= new Select(dropdown);
		
		//select one of the option
		//1. dd can be selected using 3 ways
		//using text (black), using value(blue), using index(starts with 0)
		
		//using text
		//dd.selectByVisibleText("Appium");
		
		//using value
		//dd.selectByValue("4");

		//using index
		
		dd.selectByIndex(1);
		
		
		//how to select combo box
		
		driver.findElementByXPath("(//select)[6]");
		
		//convertodd
		 
		//Select dd2= new Select(multiple);
		
		//dd2.selectByVisibleText("Selenium");
		
		//dd2.selectByVisibleText("LoadRunner");
		//dd.deselectAll();
		
	
		
		List<WebElement> options = dd.getOptions();
		for (int i=0; i< options.size(); i++) {
			System.out.println(i);
			String text = options.get(i).getText();
			System.out.println(text);
			
			
			}
		}
	}
	
	

package assignment3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erailassignment {

	public static void main(String[] args) {
		
		//Open ChromeBrowser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Create object for chromedriver
		ChromeDriver driver=new ChromeDriver();
		//loading the URL
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		//Click the 'sort on date' checkbox"
		driver.findElementByXPath("//label[text()='Sort on Date']").click();
		driver.findElementByXPath("//label[text()='Sort on Date']").click();
		//Clear and type in the from station text field
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("TBM",Keys.TAB);
		//Clear and type in the To station text field
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TPJ",Keys.ENTER);
		
		driver.findElementByXPath("//input[@id='buttonFromTo']").click();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
		
		//To store all the train names in a list
		List<WebElement> list=driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a");
		//To print the size of the list
		int listSize=list.size();
		System.out.println("The size of the list is: "+listSize);
		
		List<String> listTrainNames=new ArrayList<String>();
		
		for(WebElement ele:list)
		{
			listTrainNames.add(ele.getText());
			System.out.println(ele.getText());
		}
		//Size of the train name list
		System.out.println("size of the train names list are: "+listTrainNames.size());
		System.out.println("Elements in the list are: "+listTrainNames);
		//Declare the set and adding the list to the Set using addAll
		Set<String> setTrainNames=new LinkedHashSet<String>(listTrainNames);
		
		setTrainNames.addAll(listTrainNames);
		System.out.println("size of the train names Set is: "+setTrainNames.size());
		System.out.println("Elements in the Set are: "+setTrainNames);
		
		
		if(listTrainNames.size()==setTrainNames.size())
		{
			System.out.println("Train names are Unique");
		}
		else
		{
			System.out.println("Train names are not unique");
		}
		
		driver.close();
	}


		
	}


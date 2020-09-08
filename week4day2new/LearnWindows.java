package week4day2new;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//ctrl2+l
		String currentWindowRef = driver.getWindowHandle();
		//ctrl2+l
		Set<String> setWindows = driver.getWindowHandles();
		for (String eachwindow : setWindows) {
			driver.switchTo().window(eachwindow);
			if (driver.getTitle().contains("Sopra Banking")) {
				break;
			}
		}
		driver.close();
		
		

		//String currentWindowRef = driver.getWindowHandle();
		//System.out.println(currentWindowRef);
		
		//getwindowHandles
		/*
		 * Set<String> allWindowRef = driver.getWindowHandles(); 
		 * List<String> list = new ArrayList<String>(allWindowRef); //ctrl2+L String desiredWindow =
		 * list.get(1); driver.switchTo().window(desiredWindow);
		 * System.out.println(driver.getTitle()); driver.switchTo().window(list.get(0));
		 * System.out.println(driver.getTitle());
		 */
		/*
		 * for (String eachWindowRef : allWindowRef) {
		 * System.out.println(eachWindowRef); }
		 */
		
		//to travel from one window to another window
		
		
		
		
	
	}

}

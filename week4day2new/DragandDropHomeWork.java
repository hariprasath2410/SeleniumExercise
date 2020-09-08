package week4day2new;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropHomeWork {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);
		WebElement draggable = driver.findElementByXPath("//div[@id='draggable']");
		
		//Actions class
				Actions builder = new Actions(driver);
				WebElement src = driver.findElementById("draggable");
				WebElement dest = driver.findElementById("droppable");
				builder.dragAndDrop(src, dest)
				.perform();
				System.out.println("Dragged and Dropped");
				
	}

}

package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDroppable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://leafground.com/pages/drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//select draggable first.
		WebElement draggable = driver.findElementById("draggable");
		
		//select droppable
		
	WebElement droppable = driver.findElementById("droppable");
	
	Thread.sleep(3000);
	
	//Actions Class syntax--always use .perform when using Actions class.
	Actions builder = new Actions(driver);
	builder.dragAndDrop(draggable, droppable).perform();
	
	builder.dragAndDropBy(draggable, 100,0).perform();
	
		
		

	}

}

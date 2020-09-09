package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnFlipkart2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement clickclose = driver.findElementByXPath("//button[text()='✕']");
		clickclose.click();
		WebElement tv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		
		//Actions class
		Actions builder =new Actions(driver);
		builder.moveToElement(tv).perform();
		
		Thread.sleep(3000);
		
	WebElement LG = driver.findElementByXPath("(//a[@title='LG'])[1] ");
	LG.click();
	
	}

}

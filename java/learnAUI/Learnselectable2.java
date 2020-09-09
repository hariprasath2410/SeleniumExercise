package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learnselectable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.navigate().to("http://leafground.com/pages/selectable.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement item6 = driver.findElementByXPath("//ol[@id='selectable']/li[6]");
		WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");
		// builder.keyDown(Keys.COMMAND).click(item1).click(item3).click(item5).click(item7).perform();
		Actions builder = new Actions(driver);
		 
		builder.keyDown(Keys.COMMAND).click(item5).click(item6).click(item7).perform();
		
		//WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		//WebElement item4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		
		//Actions builder =new Actions(driver);
		//builder.clickAndHold(item1).release(item4).perform();

	}

}

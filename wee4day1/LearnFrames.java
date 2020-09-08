package wee4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleFrame);
		driver.findElementByXPath("//li[text()='Item 1']").click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Download")).click();

	}

}

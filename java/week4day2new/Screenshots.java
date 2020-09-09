package week4day2new;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void takeScreenshot(WebElement element,String eleNAme) throws IOException {
		
		Date date= new Date();
		//Source
		File src= element.getScreenshotAs(OutputType.FILE);
		//target
		File target = new File("./snapsnew/"+eleNAme+".png");
		FileUtils.copyFile(src, target);
		
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/pages/Window.html");
		//openhomepage
		WebElement home = driver.findElementByXPath("//button[text()='Open Home Page']");
		takeScreenshot(home,"OpenHomePage");
		
		WebElement openWindows = driver.findElementByXPath("//button[text()='Open Multiple Windows']");
		takeScreenshot(openWindows,"OpenMultipleWindow");
}
}
package wee4day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("http://leafground.com/pages/Window.html");
		WebElement home = driver.findElementByXPath("//button[text()='Open Home Page']");
		//Source
		File snap= home.getScreenshotAs(OutputType.FILE);
		//Destination
		File image = new File("./snapsnew/homepage.jpg");
		FileUtils.copyFile(snap, image);
		
		//Printscreen
		File snap1= driver.getScreenshotAs(OutputType.FILE);
		File image1= new File("./snapsnew/Fullpage.jpg");
		FileUtils.copyFile(snap1, image1);
		
}

}

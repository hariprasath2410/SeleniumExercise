package wee4day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTakeSnapshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleFrame);
		driver.findElementByXPath("//li[text()='Item 1']").click();
		//press the printscreen-capture the image as a file.
		File snap = driver.getScreenshotAs(OutputType.FILE);
		File image = new File("./snaps/image.jpg");
		//copy the file 
		FileUtils.copyFile(snap, image);
		
		

	}

}

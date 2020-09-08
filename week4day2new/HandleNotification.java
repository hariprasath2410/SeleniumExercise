package week4day2new;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleNotification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//declare chromeoptions
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//ChromeDriver driver= new ChromeDriver();
		
		
		
		//incognito mode-to run
		options.addArguments("-incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY,options);
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https:alibaba.com");
		driver.manage().window().maximize();
		
	}

}

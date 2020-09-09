package june20session;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTV {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to Enter in text box after entering text use keys.Enter
		driver.findElementById("twotabsearchtextbox").sendKeys("Television",Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> elements = driver.findElementsByXPath("//h2//span");
		for (int i = 0; i < elements.size(); i++) {
			WebElement element = elements.get(i);
			System.out.println(element.getText());
		}

	}

}

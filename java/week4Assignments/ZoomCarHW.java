package week4Assignments;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCarHW {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();
		driver.findElementByXPath("(//div[@class='items'])[2]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		Thread.sleep(3000);
		
		
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String tdy = sdf.format(date);
		int tmrw = Integer.parseInt(tdy)+1;
		int nxtDay = tmrw+1;
		
		
		WebElement nxtdate = driver.findElementByXPath("(//div[@class='day low-price'])[1]");
		nxtdate.click();
		WebElement clickNxt = driver.findElementByXPath("//button[@class='proceed']");
		clickNxt.click();
		WebElement TillDate = driver.findElementByXPath("(//div[@class='day low-price'])[2]");
		TillDate.click();
		WebElement clickDone = driver.findElementByXPath("//button[@class='proceed']");
		clickDone.click();
		List<WebElement> results = driver.findElementsByXPath("//div[contains(@class,'listing')]");
		System.out.println("Number of results displayed: " + results.size());
		Thread.sleep(3000);
		
		List<WebElement> carNames = driver.findElementsByXPath("//div[@class='details']/h3");
		List<WebElement> carPrice = driver.findElementsByXPath("//div[@class='price']");
		Map<String, Integer> map= new LinkedHashMap<String,Integer>();
		for (int i = 0; i <results.size(); i++) {
			String carPrices= carPrice.get(i).getText().replace("Rs", "").replace("/km", "");
			map.put(carNames.get(i).getText(),Integer.parseInt(carPrices));
		}
		
		driver.findElementByXPath("(//button[@class='book-car'])[1]").click();
		driver.close();
		
		
		}	
	
}

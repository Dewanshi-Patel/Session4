package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void mouseHoverTest() throws InterruptedException {
		
	   By PRODUCT_FIELD = By.xpath("//span[contains(text(), 'Products')]");
	   By MONITOR_FIELD = By.xpath("//a[text()='Monitors']");
	   By FOR_HOMEMONITOR_FIELD = By.xpath("//ul[@aria-label='Monitors']/descendant::a[2]");
	
	   Actions action = new Actions(driver);
	   action.moveToElement(driver.findElement(PRODUCT_FIELD)).build().perform();
	   action.moveToElement(driver.findElement(MONITOR_FIELD)).build().perform(); 
	   Thread.sleep(7000);
	   
	   driver.findElement(FOR_HOMEMONITOR_FIELD).click();
	
	

	
	}
	
}

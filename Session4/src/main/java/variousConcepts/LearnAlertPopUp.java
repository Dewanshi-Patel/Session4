package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertPopUp {


		WebDriver driver;

		@Before
		public void init() {

			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}	
		
		@Test
		public void alertPopupTest() {
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			
	
			
	
	
		}	
	
}

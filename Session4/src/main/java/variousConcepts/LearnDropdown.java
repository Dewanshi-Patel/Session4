package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import junit.framework.Assert;




public class LearnDropdown {

	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}	
	
	@Test
	public void loginTest() {
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@class='btn btn-success block full-width']")).click();
		
		
		By DASHBOARD_HEADER_FIELD = By.xpath("//h2[text()=' Dashboard ']");
		WebElement DASHBOARD_HEADER_ELEMENT = driver.findElement(DASHBOARD_HEADER_FIELD);
		
//		Assert.assertTrue("Wrong Page!!!", driver.findElement(DASHBOARD_HEADER_FIELD).isDisplayed());
//		Assert.assertEquals("Dashboard not found", "Dashboard", driver.findElement(DASHBOARD_HEADER_FIELD).getText());
	
		Assert.assertEquals("Dashboard not found", "Dashboard- iBilling", driver.getTitle());
		
		driver.findElement(By.xpath("//span[text()= 'Customers']")).click();
		driver.findElement(By.xpath("//a[text()= 'Add Customer']")).click();
		
		 By COMPANY_DROPDOWN_FIELD = By.xpath("//select[@ id='cid']");
		 
		 Select sel1 = new Select(driver.findElement(COMPANY_DROPDOWN_FIELD));
		 sel1.selectByVisibleText("Amazon");
		 
		 By COUNTRY_DROPDOWN_FIELD = By.xpath("//select[@ name='country']");
		 
		 Select sel2 = new Select(driver.findElement(COUNTRY_DROPDOWN_FIELD));
		 sel2.selectByVisibleText("India");
		
//		  Select sel;
//		sel.getOptions();
		
	
	}	
}

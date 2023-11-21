package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_07_Check_Locator2 {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/register");
	}

	@Test
	public void TC_01_ID() {
	        driver.findElement(By.id("FirstName")).sendKeys("Automation");
	}
	@Test
	public void TC_02_Class() {
		//<input class="search-text" type="text" id="q" name="q">
		driver.get("https://demo.nopcommerce.com/search");
		driver.findElement(By.className("search-text")).sendKeys("Window");
	}

	@Test
	public void TC_03_Name(){
		//Click on Advanced Search check-box		
		driver.findElement(By.name("advs")).click();
		
	}
	@Test
	public void TC_04_TagName(){
		// Find number of "Input" on current screen
		driver.findElement(By.tagName("input")).getSize();
	}
	@Test
	public void TC_05_LinkText(){
		// Tuyet doi
		driver.findElement(By.linkText("Addresses")).click();
	}
	@Test
	public void TC_06_PatialLinkText(){
		// Tuong doi
		driver.findElement (By.partialLinkText("vendor account")).click();	
	}
	@Test
	public void TC_07_CSS(){
	
		driver.get("https://demo.nopcommerce.com/register");
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Locator");
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("automation@gmail.com");
	}
	@Test
	public void TC_07_Xpath(){
	
		driver.get("https://demo.nopcommerce.com/register");
		driver.findElement(By.cssSelector("//input[#id='LastName']")).sendKeys("Locator");
		driver.findElement(By.cssSelector("//label[text()='Email:']/following-sibling::input")).sendKeys("automation@gmail.com");
	}
	
	
	
	
	
	@AfterClass
	public void afterClass() {
		
	}

}

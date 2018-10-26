package com.jcrew.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MailComposeTest {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		//System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
				
	}
	
	@AfterMethod	
	public void teardown() throws InterruptedException
	{
		Thread.sleep(8000);
		driver.quit();
	}
	
	@Test
	public void composeMailTest()
	{
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("p.laxman1211");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).submit();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Jcrew@123");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Title Verify
		String title = driver.getTitle();
		Assert.assertEquals(title, "Gmail");
		System.out.println("Title Verified and passed..");
		
	// Compose Mail Task
		// Compose button
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// enter Email-id
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("p.laxman1211@gmail.com");
		
		// enter Subject
		driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Subject: Selenium mail compose");
		// enter Body message
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Starting :-) ChromeDriver 2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73) on port "+
																"Only local connections are allowed."+
																"Sep 02, 2018 4:06:47 PM org.openqa.selenium.remote.ProtocolHandshake createSession"+
																"INFO: Detected dialect: OSS");		
		
		// Send button
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String msgSent = driver.findElement(By.xpath("//span[text()='Message sent.']")).getText();	
		Assert.assertEquals(msgSent, "Message sent.");
		System.out.println("Message sent and passed..");
	}
}

package com.jcrew.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestJcrew {
	
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
	public void teardown()
	{
		driver.quit();
	}
	
	
	// Jira Test Case
	@Test
	public void Test1() throws InterruptedException
	{
		driver.get("https://jcrewtracker.jira.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(6000);
		//driver.findElement(By.xpath(".//*[@id='menu-sign-in']/div/a/span/svg")).click();
		//Thread.sleep(6000);
		driver.findElement(By.id("username")).sendKeys("geetha.natarajan.cft@jcrew.com");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("password")).sendKeys("Jcrew901722");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(6000);
		driver.navigate().to("https://jcrewtracker.jira.com/browse/JCBEMAIL-4192");
		
		Thread.sleep(10000);
		for(int i = 1; i <= 10; i++)
		{
		String preHeader = driver.findElement(By.xpath("//div[@id='customfieldmodule']/div/div/ul//li["+i+"]/div/div")).getText();
		System.out.println("preHeader.."+preHeader);
		}
		//Assert.assertTrue(preHeader.isEmpty());	
	}
	
	
	// 	Jcrew or Factory or MadeWell
	/*@Test
	public void siteTest()
	{
		driver.get("https://jcrewtracker.jira.com/");
	}*/

}

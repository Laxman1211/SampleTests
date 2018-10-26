package com.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaxmanTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2, groups = "Title")
	public void testTitle()
	{
		String title= driver.getTitle();
		System.out.println("title of the is.."+title);
		Assert.assertEquals(title,"Google");		
	}
	
	@Test(priority=1, groups = "Links")
	public void testGmilLink()
	{
		System.out.println("test Gmil Link..");
	}
	
	@Test(priority=3, groups = "Logo's")
	public void testLogo()
	{
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
	}
	
	@Test(priority=5, groups = "Tests")
	public void test1()
	{
		System.out.println("test 1..");
	}
	
	@Test(priority=4, groups = "Tests")
	public void test3()
	{
		Assert.fail("Test FAIL..");
		System.out.println("test 3..");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("browser closed..");
	}
	
}

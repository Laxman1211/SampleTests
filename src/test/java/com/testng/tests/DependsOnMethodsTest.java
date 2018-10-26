package com.testng.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testTitle()
	{
		String title= driver.getTitle();
		System.out.println("title of the is.."+title);
		Assert.assertEquals(title,"Google");		
	}
	
	@Test(groups = "Lonks")
	public void testGmilLink()
	{
		System.out.println("test Gmil Link..");
	}
	
	@Test(groups = "Ligo's")
	public void testLogo()
	{
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
	}
	
	@Test
	public void test1()
	{
		Assert.fail("Test FAIL..");
		//System.out.println("test 1..");
	}
	
	@Test(dependsOnMethods="test1")
	public void test2()
	{
		System.out.println("test 2..");
	}
	
	@Test()
	public void test3()
	{
		//Assert.fail("Test FAIL..");
		System.out.println("test 3..");
	}
	
	@Test(enabled=false)
	public void ignoreTestMethod()
	{
		System.out.println("Ignored Test Method");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("browser closed..");
	}
}

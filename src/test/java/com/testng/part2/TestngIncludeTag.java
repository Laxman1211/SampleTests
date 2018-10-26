package com.testng.part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngIncludeTag {
	//WebDriver driver;
	/*@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}*/
	
	@Test
	public void c()
	{
		System.out.println("cccc..");		
	}
	
	@Test
	public void a()
	{
		System.out.println("aaa.. ");
	}
	
	@Test(groups="login")
	public void b()
	{
		System.out.println("bbb.. ");
	}
	
	@Test(groups="login")
	public void e()
	{
		System.out.println("eee.. ");
	}
	
	@Test
	public void d()
	{		
		System.out.println("ddd.. ");
	}
	
	/*@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("browser closed..");
	}*/

}

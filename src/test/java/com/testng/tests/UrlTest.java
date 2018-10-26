package com.testng.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UrlTest {
	
	WebDriver driver;
	@Test
	public void wrongUrlTest()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.getTitle();
	}

}

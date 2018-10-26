package com.testng.part2;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.Utils;

public class TestDataprovider {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		System.out.println("browser closed..");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData = Utils.getExcelData();
		return testData.iterator();
	}
	
	@Test(dataProvider = "getTestData")
	public void testDataprovider(String uname, String passwd)
	{	
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_field")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.name("commit")).click();
	}
}

package com.jars.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class FramesTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("laxmanp");
		driver.findElement(By.name("password")).sendKeys("Satyam@123");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		Thread.sleep(4000);
		WebElement frame = driver.findElement(By.xpath("//frame[@name='mainpanel']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Contacts']")).isDisplayed());
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//driver.findElement(By.linkText("Contacts")).click();

		//System.out.println("This is working..");

		// Browser close
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.quit();
		System.out.println("Browser closed..");
	}

}
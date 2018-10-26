package com.jcrew.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitTest {
	WebDriver driver;
	@Test
	public void guru99tutorials() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
	driver = new ChromeDriver();		
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	WebDriverWait wait=new WebDriverWait(driver, 20);
//	guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated
//			(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	driver.get("http://demo.guru99.com/test/guru99home/" );
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	//close browser
	driver.close();
  }
}

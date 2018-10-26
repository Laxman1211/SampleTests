/**
 * 
 */
package com.expedia.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.expedia.pages.LoginPage;

/**
 * @author laxman_p
 *
 */
public class VerifyExpediaLogin {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		//System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.co.in");
	}
	
	@AfterMethod	
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		
		LoginPage login = new LoginPage(driver);
		
		login.UserName("p.laxman1211@gmail.com");
		
		login.password("Satyam@123");
		
		login.loginButton();
		
		Thread.sleep(6000);
		
	}
}

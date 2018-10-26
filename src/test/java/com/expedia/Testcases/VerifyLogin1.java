/**
 * 
 */
package com.expedia.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.expedia.pages.Login1;

import helper.BrowserFactory;

/**
 * @author laxman_p
 *
 */
public class VerifyLogin1 {

	// Valid user details login
	@Test
	public void checkValidUser()
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.expedia.co.in");
		
		Login1 login_page = PageFactory.initElements(driver, Login1.class);
		
		login_page.login_expedia("p.laxman1211@gmail.com", "Satyam@123");
		
	}
	
	// InValid user details login
	@Test
	public void checkInValidUser()
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.expedia.co.in");
		
		Login1 login_page = PageFactory.initElements(driver, Login1.class);
		
		login_page.login_expedia("helloabc@gmail.com", "abc@123");
		
	}
	
}

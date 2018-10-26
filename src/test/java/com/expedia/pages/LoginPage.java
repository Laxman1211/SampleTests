/**
 * 
 */
package com.expedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author laxman_p
 *
 *	this class will store all the locators of login page
 *
 *	other pages - Login, Create account , Hotels, Discover
 *
 */

public class LoginPage 
{	
	
	WebDriver driver;
	
	// Account 
	By loginIcon = By.id("header-account-menu");
	
	// Sign in
	By signInIcon = By.xpath("//div[@id='header-account-signin-expand']/button");
	
	// uName
	By uName = By.name("signin-loginid");
	
	// pwd
	By pwd = By.id("signin-password");
	
	// Submit button	
	By loginButton = By.id("submitButton");
	

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;  
	}
	
	public void UserName(String uname)
	{
		driver.findElement(loginIcon).click();
		driver.findElement(signInIcon).click();
		driver.findElement(uName).sendKeys(uname);
	}
	
	public void password(String pswd)
	{
		driver.findElement(pwd).sendKeys(pswd);
	}
	
	public void loginButton()
	{
		driver.findElement(loginButton).click();
	}

}

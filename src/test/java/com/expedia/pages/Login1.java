/**
 * 
 */
package com.expedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * @author laxman_p
 *
 */
public class Login1 {
	
	WebDriver driver;
	
	public void Login1(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
		
	@FindBy(id = "header-account-menu")
	WebElement loginIcon;
		
	@FindBy(how = How.XPATH, using = "//div[@id='header-account-signin-expand']/button")
	WebElement signInIcon;
		
	@FindBy(name = "signin-loginid")
	WebElement username;
	
	@FindBy(how = How.ID, using = "signin-password")
	WebElement password;
	
	@FindBy(how = How.ID, using = "submitButton")
	WebElement subButton;
	
	public void login_expedia(String uid, String pwd)
	{
		loginIcon.click();
		signInIcon.click();
		username.sendKeys(uid);
		password.sendKeys(pwd);
		subButton.click();
		
	}

	
}

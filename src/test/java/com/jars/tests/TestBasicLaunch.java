package com.jars.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasicLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String expTitle = "Google";
		String actTitle = driver.getTitle();
		if(expTitle.equals(actTitle))
		{
			System.out.println("Correct Title..");
		}
		else
		{
			System.out.println("InCorrect Title..");
		}
		driver.quit();
	}
}
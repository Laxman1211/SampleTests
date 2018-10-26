package com.jars.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		Thread.sleep(2000);
		WebElement photo = driver.findElement(By.id("photo"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(photo);
		actions.perform();
		
		driver.findElement(By.id("photo")).sendKeys("E:\\Users\\laxman_p\\Downloads\\Automation.txt");
		System.out.println("File upload done.. ");
		
		// Radio buttons check with isSelected();
		/*boolean bValue = false;
		list.get(0).click();
		bValue = list.get(0).isDisplayed();
		System.out.println("bValue "+bValue);
		Thread.sleep(3000);*/
		
		/*for(int i=0; i < list.size() ; i++ ){

			 String sValue = list.get(i).getAttribute("value");		 
			 System.out.println("Value.. "+sValue);

			 if (sValue.equalsIgnoreCase("toolsqa")){		 
				 list.get(i).click();
		 
				 break;		 
				 }		 
			}*/
		Thread.sleep(5000);
		driver.close();
		
	}
}

package com.jars.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		WebElement closeButon = driver.findElement(By.xpath("//a[@class='om-close miami-element-close miami-close']"));		
										
		if(closeButon.isDisplayed())
		{
			System.out.println("close Buton is there.. ");
			closeButon.click();
			System.out.println("close Buton closed ");
		}
		
		driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("E:\\Users\\laxman_p\\Desktop\\PromoFeature.txt");
		//driver.findElement(By.xpath("//*[@id='post-206']/div/div[3]/form/input[2]")).click();
		
	}

}
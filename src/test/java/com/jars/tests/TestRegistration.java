package com.jars.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRegistration {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("autouser1@example.org");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
		
		driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("customer_firstname");
		
		driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("customer_lastname");
		
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("customer_lastname");
			  
		  List<WebElement> RadioButtonList = driver.findElements(By.name("id_gender"));		  
		  System.out.println("Total numer of Radio Buttons for gender field is: " +RadioButtonList.size());
		  
		// Dates dropdown 
		 Select day =new Select(driver.findElement(By.xpath("//*[@id='days']")));
		 day.selectByIndex(2);
		 Select month =new Select(driver.findElement(By.xpath("//*[@id='months']")));
		 month.selectByIndex(2);
		 Select year =new Select(driver.findElement(By.xpath("//*[@id='years']")));
		 year.selectByIndex(2);

		 driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		
		 WebElement header = driver.findElement(By.xpath("//h3[text()='Your address']"));
		 header.isDisplayed();
		 header.getText();
		 System.out.println("header text "+header);
		 
		 driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("customer_firstname");
		 driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("customer_lastname");
		 driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("3-129. Chakkunta");
		 driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Karimnagar");
		 driver.findElement(By.xpath("//*[@id='id_state']/option[3]")).click();
		 
		 driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("10019");
		 driver.findElement(By.xpath("//*[@id='id_country']/option[2]")).click();
		 driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("8888777767");
		 driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("autouser2@example.org");
		 driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		 
		
		 System.out.println("filled application form..");
		
		// Driver close
		Thread.sleep(8000);
		driver.quit();
		System.out.println("Browser closed..");
	}

}

// END OF THE PROGRAM


/* String firstname = driver.findElement(By.xpath("//*[@id='customer_firstname']")).getAttribute("value");
if(firstname.isEmpty())
{
	System.out.println("firstname is mepty");
}
else {
	System.out.println("firstname has value "+firstname);
}


String email = driver.findElement(By.xpath("//*[@id='email']")).getAttribute("value");
if(firstname.isEmpty())
{
	System.out.println("email is mepty");
}
else {
	System.out.println("email has value "+email);
	
}
String emailValue = driver.findElement(By.xpath("//*[@id='email']")).getText();
System.out.println("email has value.."+emailValue); */



/*for (int i = 0; i < RadioButtonList.size(); i++){
String gend = RadioButtonList.get(i).getAttribute("value");
System.out.println("gender is "+gend);
if (gend.equalsIgnoreCase((valueOfGender))){
 RadioButtonList.get(i).click();
 break;
}

}*/

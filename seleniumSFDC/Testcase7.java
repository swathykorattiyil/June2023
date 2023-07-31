             package com.training.seleniumSFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("swathy@techarch.com");
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("kiran@123");
		WebElement Login= driver.findElement(By.id("Login"));
		Login.click();	
		
		WebElement user = driver.findElement(By.id("userNavLabel"));
		user.click();
		//a[@class='menuButtonMenuLink']
		WebElement mysettings = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink']"));
		mysettings.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement personal = driver.findElement(By.id("PersonalInfo_font"));
		personal.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement LoginHistory = driver.findElement(By.id("LoginHistory_font"));
		LoginHistory.click();
		
		WebElement displaylog = driver.findElement(By.id("DisplayAndLayout_font"));
		displaylog.click() ;
		WebElement mytab =driver.findElement(By.id("CustomizeTabs_font"));
		mytab.click();
		WebElement dropdown =driver.findElement(By.id("p4"));
		dropdown.click();
		
		
}
}
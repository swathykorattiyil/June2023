package com.training.seleniumSFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("swathy@techarch.com");
		
		//WebElement password= driver.findElement(By.id("password"));
		//password.sendKeys("kiran@123");
		WebElement Login= driver.findElement(By.id("Login"));
		Login.click();		

	}
}

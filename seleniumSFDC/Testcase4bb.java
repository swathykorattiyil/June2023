package com.training.seleniumSFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase4bb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("123");
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("22131");
		
		
		WebElement checkbox = driver.findElement(By.id("rememberUn"));
		checkbox.click();
		WebElement Login= driver.findElement(By.id("Login"));
		Login.click();		
	}

}

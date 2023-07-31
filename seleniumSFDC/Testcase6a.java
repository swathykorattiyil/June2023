package com.training.seleniumSFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch application
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("swathy@techarch.com");
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("kiran@123");
		WebElement user = driver.findElement(By.id("userNavLabel"));
		user.click();
		
		//edit profile link
		WebElement profile = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink firstMenuItem']"));
		profile.click();
		//WebElement edit = driver.findElement(By.xpath("//img[@src=/img/func_icons/util/pencil12.gif]"));
		//edit.click();
		
	}

}

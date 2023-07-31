package com.training.seleniumSFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase6 {
	//static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launchAppliation();
		// login();
		//myprofile();
	//	 Abouttab();
	//}
	//static void launchAppliation() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
	//}
	//static void login() {
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("swathy@techarch.com");
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("kiran@123");
	
	
		WebElement Login= driver.findElement(By.id("Login"));
		Login.click();		
	//}
	//static void myprofile() {	
		
		WebElement usermenu = driver.findElement(By.id("userNavLabel"));
		usermenu.click();
		WebElement profile = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink firstMenuItem']"));
		profile.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		WebElement edit = driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img"));
		edit.click();
		
		WebElement About= driver.findElement(By.xpath("//iframes[@id='contactInfoContentId']"));
		About.switchTo().frames(textareframes);
		
		//WebElement saveall= driver.findElement(By.xpath("//iframes[@id='contactInfoContentId']"));
		//saveall.click();
		
		}
	
	//static void Abouttab() {
		
		
	
	

}

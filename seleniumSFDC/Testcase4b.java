package com.training.seleniumSFDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.github.dockerjava.api.model.Driver;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase4b {
	static WebDriver driver;

	public static void main(String[] args) {
		//forgot password
		LaunchApplication();
		wrongusernameandpassword();
		login();
	}
	static void LaunchApplication() {
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com");
	}
	static void wrongusernameandpassword()
	{
		//WebDriver driver;
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("123");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("22131");
	}
	static void checkbox() {
		WebElement checkbox = driver.findElement(By.id("rememberUn"));
		checkbox.click();
	}
	
	static void login() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
	}
	



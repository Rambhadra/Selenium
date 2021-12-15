package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateDriver {
	public static WebDriver driver;
	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver","E:/SELENIUM/file/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver getFireFoxDriver() {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Files\\Data\\geckodriver.exe");
		driver=new FirefoxDriver();
		return driver;
	}
}

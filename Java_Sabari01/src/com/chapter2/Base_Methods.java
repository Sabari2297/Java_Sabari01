package com.chapter2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Methods {
	
	public static WebDriver driver;
	
	public static void initiateBrowser(String browser) throws InterruptedException {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
		}else if (browser.equalsIgnoreCase("gecko")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\Driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
		}

	}
	
	public static void getUrl(String url) {
		
		driver.get(url);
	

	}
	
	
	public static void closeBrowser() {
		
		driver.quit();
	

	}

}

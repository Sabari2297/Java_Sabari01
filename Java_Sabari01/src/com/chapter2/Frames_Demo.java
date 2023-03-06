package com.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames_Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		WebElement single = driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame("SingleFrame");
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
		
		textBox.sendKeys("Hello");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		WebElement multiple = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
		multiple.click();
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		
		driver.switchTo().frame(innerFrame);
		
		WebElement textBox1 = driver.findElement(By.xpath("//input[@type='text']"));
		
		Thread.sleep(2000);
		
		textBox1.sendKeys("This Frames");
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}

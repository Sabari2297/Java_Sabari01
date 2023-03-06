package com.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alertBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		alertBox.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		WebElement alertBox1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		alertBox1.click();
		
		WebElement okOrCancel = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		okOrCancel.click();
		
		driver.switchTo().alert().dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		
		prompt.click();
		
		WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		alert.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("Good Morning");
		
		driver.switchTo().alert().accept();
		
		
	}

}

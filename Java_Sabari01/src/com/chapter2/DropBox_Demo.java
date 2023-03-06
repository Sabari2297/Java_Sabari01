package com.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox_Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		user.click();
		
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		
		name.sendKeys("Sabarinathan");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day);
		
		s.selectByIndex(21);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1 = new Select(month);
		
		s1.selectByValue("9");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2 = new Select(year);
		
		s2.selectByVisibleText("1997");
		
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		gender.click();
		
		WebElement signUp = driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		
		signUp.click();
		
		
		
	}

}

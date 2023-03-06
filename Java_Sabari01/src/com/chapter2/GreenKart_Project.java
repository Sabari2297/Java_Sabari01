package com.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GreenKart_Project {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		WebElement addToKart = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		
		addToKart.click();
		
		Thread.sleep(1000);
		
		WebElement addToKart1 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		
		addToKart1.click();
		
		Thread.sleep(1000);
		
		WebElement addToKart2 = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		
		addToKart2.click();
		
		Thread.sleep(1000);
		
		WebElement goToKart = driver.findElement(By.xpath("//a[@class='cart-icon']"));
		
		goToKart.click();
		
		WebElement proceed = driver.findElement(By.xpath("//button[@type='button']"));
		
		proceed.click();
		
		Thread.sleep(1000);
		
		WebElement promoCode = driver.findElement(By.xpath("//input[@class='promoCode']"));
		
		promoCode.sendKeys("25562552");
		
		WebElement apply = driver.findElement(By.xpath("//button[@class='promoBtn']"));
		
		apply.click();
		
		WebElement placeOrder = driver.findElement(By.xpath("//button[text()='Place Order']"));
		
		placeOrder.click();
		
		WebElement country = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		
		Select s = new Select(country);
		
		s.selectByValue("Algeria");
		
	WebElement agreeButton = driver.findElement(By.xpath("//input[@class='chkAgree']"));
	
	agreeButton.click();
	
	Thread.sleep(1000);
	
	WebElement proceed1 = driver.findElement(By.xpath("//button[text()='Proceed']"));
	
	proceed1.click();
	
	Thread.sleep(1000);
	
	driver.quit();
	}

}

package com.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		WebElement men = driver.findElement(By.xpath("(//a[@data-reactid='21'])[1]"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(men).perform();
		
		WebElement sweatshirt = driver.findElement(By.xpath("//a[@data-reactid='37']"));
		
		ac.moveToElement(sweatshirt).perform();
		
		ac.click(sweatshirt).perform();

}
}

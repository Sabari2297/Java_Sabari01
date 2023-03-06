package com.chapter2; 



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(mobiles).contextClick().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		ac.moveToElement(electronics).contextClick().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		ac.moveToElement(fashion).contextClick().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> window = driver.getWindowHandles();
		
		ArrayList<String> win = new ArrayList<>(window);
		
		String home = driver.switchTo().window(win.get(0)).getTitle();
		System.out.println(home);
		
		String fash = driver.switchTo().window(win.get(1)).getTitle();
		System.out.println(fash);
		
		String elect = driver.switchTo().window(win.get(2)).getTitle();
		System.out.println(elect);
		
		String mobile1 = driver.switchTo().window(win.get(3)).getTitle(); 
		System.out.println(mobile1);
		
		WebDriver fashion2 = driver.switchTo().window(win.get(2));
	}

}

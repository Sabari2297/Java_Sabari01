package com.chapter2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Screenshot_Demo extends Base_Methods{
	
	public static void main(String[] args) throws InterruptedException,IOException{
		
	    initiateBrowser("gecko");
	    
	    getUrl("https://www.myntra.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver ;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\ScreenShot\\img1.png");
		
	    Files.copy(source, target);
	    
	    driver.navigate().to("https://www.flipkart.com/");
	    
	    
	    TakesScreenshot ts1 = (TakesScreenshot)driver;
	    
	    File source1 = ts1.getScreenshotAs(OutputType.FILE);
	    
	    File target1 = new File("C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\ScreenShot\\img2.png");
	    
	    Files.copy(source1, target1);
	    
	    closeBrowser();
		
	}

}

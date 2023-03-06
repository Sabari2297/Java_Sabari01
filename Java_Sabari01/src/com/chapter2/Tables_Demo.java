package com.chapter2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables_Demo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sabarinathan\\eclipse-workspace\\Java_Sabari01\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> table = driver.findElements(By.id("customers"));
		
		System.out.println("=====To Print All Data=====");
		
		for (WebElement allData : table) {
			
			System.out.println(allData.getText());
			
		}
		
		System.out.println("=====To Print Row=====");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]"));
		
		for (WebElement rowData : row) {
			
			System.out.println(rowData.getText());
			
		}
		
		System.out.println("=====To Print Column=====");
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));
		
		for (WebElement columnData : column) {
			
			System.out.println(columnData.getText());
			
		}
		
		System.out.println("=====Row Size=====");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr"));
		
		int rowSize = rows.size();
		
		System.out.println(rowSize);
		
		System.out.println("=====Colunm Size=====");
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/th"));
		
		int columnSize = columns.size();
		
		System.out.println(columnSize);
	}

}

package com.chapter2;

public class AdactinLogin extends Base_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		initiateBrowser("gecko");
		
		getUrl("https://adactinhotelapp.com/");
		
		AdactinPom a = new AdactinPom(driver);
		
		a.getUsername().sendKeys("sabari123");
		
		a.getPassword().sendKeys("Sabari@1997");
		
		a.getLogin().click();
		
		closeBrowser();
		
		
	}

}

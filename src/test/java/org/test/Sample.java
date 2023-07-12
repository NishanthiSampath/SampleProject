package org.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample extends BaseClass {
	
	public static void main(String[] args) {
		chromeBrowser();
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		implicitlyWait(20);
			
		System.out.println("Test 1");
		
		
		
		
	}
	
	
}

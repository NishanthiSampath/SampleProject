package org.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample extends Loginpage {
	
	public static void main(String[] args) {
		chromeBrowser();
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		implicitlyWait(20);
		
		Loginpage l =new Loginpage();
		
		click(l.btncross);
		
		
		
				
	}
	
	
}

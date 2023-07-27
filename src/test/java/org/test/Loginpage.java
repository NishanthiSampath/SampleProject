package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
	public Loginpage() {
        PageFactory.initElements(driver, this);
} 
	@FindBy(xpath="_2KpZ6l _2doB4z")
	private WebElement btnclose; 
	
	@FindBy(xpath="text")
	private WebElement Search;
	
	@FindBy(xpath="_2KpZ6l _2doB4z")
	protected WebElement btncross;

	
	

}

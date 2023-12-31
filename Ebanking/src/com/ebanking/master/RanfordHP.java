package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP 
{

	//Element Properties
	
	@FindBy(id="txtuId")
	WebElement Uname;
	
	@FindBy(id="txtPword")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\'login\']")
	WebElement Lgn;
	
	//Element Methods
	
	
	public void Login() 
	{
	   Uname.sendKeys("Admin");
	   Password.sendKeys("Admin");
	   Lgn.click();
	}
}

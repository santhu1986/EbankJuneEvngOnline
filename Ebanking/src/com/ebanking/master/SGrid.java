package com.ebanking.master;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SGrid 
{
     DesiredCapabilities Cap;
     
     @Parameters("Browser")
     @Test
	public void Grid(String BR) throws MalformedURLException, InterruptedException 
	{
    	 if (BR.equalsIgnoreCase("firefox"))
    	 {
    	    	Cap=new DesiredCapabilities();
    			Cap.setBrowserName("firefox");
    			Cap.setPlatform(Platform.WINDOWS);
    				
		}
    	 else if(BR.equalsIgnoreCase("Chrome"))
    	 {
    		 Cap=new DesiredCapabilities();
 			Cap.setBrowserName("chrome");
 			Cap.setPlatform(Platform.WINDOWS);
    	 }
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.41.1:4444/wd/hub"),Cap);
		
		driver.manage().window().maximize();
		driver.get("http://103.211.39.246/ranford2");
		Thread.sleep(3000);
		//Admin Login
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.Login();
		Thread.sleep(3000);
		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Rol();
		
		Thread.sleep(3000);
		
		//New Role

		Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
	    RD.NewRole();
	    Thread.sleep(3000);
	  
	    //Role Creation
	    
	    RoleCreation RC=PageFactory.initElements(driver,RoleCreation.class);
	    RC.Rcreation("Cashierkjkj","E");
	    
	    Thread.sleep(3000);
	    //Alert
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();

		
		
	}
}

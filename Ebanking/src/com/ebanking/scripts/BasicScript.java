package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String Expval="Ranford Bank";
		
		//Launch Firefox
		
		WebDriver driver=new ChromeDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://103.211.39.246/ranford2/");
		
		String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval))
		{
		System.out.println("Application Launch Succ");	
		}
		else
		{
			System.out.println("Application Failed to Launch");
		}
		
		//Get Title
		
		String Tit=driver.getTitle();
		System.out.println(Tit);
		
		//Admin Login
		
		Expval="Welcome to Admin";
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("TestingMindq");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'login\']")).click();
		
		Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
	     	System.out.println("Admin Login Succ");	
		}
		else
		{
			System.out.println("Admin Login Failed");
		}
		
		//Branch Creation
		
	     Expval="Sucessfully";
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		driver.findElement(By.id("BtnNewBR")).click();
		
		
		driver.findElement(By.id("txtbName")).sendKeys("HydBrnchBnk");
		driver.findElement(By.id("txtAdd1")).sendKeys("SrNagar");
		Thread.sleep(3000);
		driver.findElement(By.id("txtZip")).sendKeys("12356");
		
		//Drop Down
		
		new Select(driver.findElement(By.id("lst_counrtyU"))).selectByVisibleText("INDIA");
		new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText("GOA");
		new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText("GOA");
		
		driver.findElement(By.id("btn_insert")).click();
		
		//Alert
		
		Actval=driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//Comparision
		
		if (Actval.contains(Expval)) 
		{
			System.out.println("Branch Created");
		}
		else
		{
			System.out.println("Branch Already Exist");
		}
		
		
		//Role Creation
		
		//Employee Creation
		
		//Banker Login
	}

}

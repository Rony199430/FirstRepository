package com.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGpractice {
	
	
	@Test
	public void test1() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");  
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://yahoo.com");
		driver.findElement(By.id("ybar-sbq")).click(); 
		Thread.sleep(2000); 
		driver.findElement(By.id("ybar-sbq")).sendKeys("google");
		driver.findElement(By.xpath("//button[@id='ybar-search']")).click();
		Thread.sleep(2000);			
		
		driver.close(); 
	}

}

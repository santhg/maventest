package com.codebind;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class app {
	public static void main(String[] args) throws InterruptedException
	{	
	FirefoxDriver d1=new FirefoxDriver();
	d1.get("www.ubtiinc.com");
		d1.findElement(By.linkText("AEROSPACE")).click();
		 //Thread.sleep(8000);
       d1.findElement(By.partialLinkText("CAPSTONE PERFORMANCE VISIBILITY")).click();
        //Thread.sleep(2000);
	    d1.findElement(By.className("img-portion")).click();
	   Thread.sleep(2000);
		String URL="https://ubtiinc.com/aerospace-and-defense/capstone/";
		d1.navigate().to(URL);
		d1.findElement(By.linkText("QUALITY MANAGEMENT")).click();
		Thread.sleep(2000);
		String URL1="https://ubtiinc.com/aerospace-and-defense/capstone/";
		d1.navigate().to(URL1);
		d1.findElement(By.linkText("PROGRAM PERFORMANCE")).click();
		Thread.sleep(2000);
		String URL2="https://ubtiinc.com/aerospace-and-defense/capstone/";
		d1.navigate().to(URL2);
		d1.findElement(By.linkText("ALERT MANAGEMENT")).click();
		Thread.sleep(2000);
		String URL3="https://ubtiinc.com/aerospace-and-defense/capstone/";
		d1.navigate().to(URL3);
       d1.findElement(By.partialLinkText("CAPSTONE PROGRAM")).click();
       // Thread.sleep(8000);
       d1.findElement(By.partialLinkText("CAPSTONE SUPPLIER")).click();
       // Thread.sleep(8000);
       d1.findElement(By.partialLinkText("CAPSTONE QUALITY")).click();
       // Thread.sleep(8000);
       d1.findElement(By.partialLinkText("CAPSTONE ALERT")).click();
        //Thread.sleep(8000);
       d1.findElement(By.linkText("TRINITY FRAMEWORK")).click();
       // Thread.sleep(8000);
       d1.findElement(By.partialLinkText("DEVELOPMENT ")).click();
       // Thread.sleep(8000);
        //d1.findElement(By.linkText("learn more.")).click();
       d1.findElement(By.partialLinkText("DATA")).click();
       // Thread.sleep(8000);
        //d1.findElement(By.linkText("learn more.")).click();
       d1.findElement(By.partialLinkText("ANALYTICS")).click();
       // Thread.sleep(8000);
       // d1.findElement(By.linkText("learn more.")).click();
       d1.findElement(By.partialLinkText("QA")).click();
        //Thread.sleep(8000);
       // d1.findElement(By.linkText("learn more.")).click();
       d1.findElement(By.partialLinkText("OPERATION")).click();
        Thread.sleep(2000);
        //d1.findElement(By.linkText("learn more.")).click();
        d1.get("https://www.ubtiinc.com");
        
		
	}
}

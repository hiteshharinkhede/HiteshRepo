package com.testdemo.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.netty.util.Signal;

public class HandlingDrop {

	
     public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver =new ChromeDriver();
    	 
    	 driver.get("https://www.testingshastra.com/dropdown-list-assignment/");
         driver.manage().window().maximize();
    	 driver.executeAsyncScript("window.scrollBy(0,200)");
    	 
    	 WebElement skills= driver.findElement(By.xpath("//select[@class=\"single-select\"]"));
    	 Select select =new Select(skills);
//    	 Thread.sleep(2000);
    	 
    	 select.selectByVisibleText("october");
    	 
    	 
    	 
	}
	
	
	
	
	
}

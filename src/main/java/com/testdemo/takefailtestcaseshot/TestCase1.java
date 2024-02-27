package com.testdemo.takefailtestcaseshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(Failtestcasescreenshot.class)
public class TestCase1 extends Config {
    
	@Test
	public void openFlipkart() throws InterruptedException {

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	WebElement ele=	driver.findElement(By.xpath("//div[contains(text(),\"Fashion\")]"));
		Actions action =new Actions(driver);
		action.moveToElement(ele).perform();
	

	}

}

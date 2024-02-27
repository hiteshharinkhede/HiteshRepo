package com.testdemo.Excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HandlingWebtable {
     @Test
	public void handlingStaticWebtable() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.executeScript("window.scrollBy(0,500)");
		for (int i = 2; i <= 7; i++) {
			for (int j = 1; j <= 3; j++) {

				WebElement ele = driver.findElement(By.xpath("//tbody[@style=\"box-sizing: inherit;\"]/tr["+i+"]/td["+j+"]"));
				System.out.print(ele.getText() + " ");
			}
           System.out.println();
		}

	}

}

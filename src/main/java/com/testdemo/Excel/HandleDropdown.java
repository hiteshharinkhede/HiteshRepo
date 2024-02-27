package com.testdemo.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.testdemo.takefailtestcaseshot.Config;

public class HandleDropdown extends Config {

	@Test
	public void handlingDropdownwithoutSelect() {

		driver.get("https://testingshastra.com/assignments/drop-down");

		driver.findElement(By.xpath("//select[@class=\"single-select\"]")).click();// without select class we have to
																					// use locator to find dropdown list
		driver.findElement(By.xpath("//select[@class=\"single-select\"]/option[@value=\"Feb\"]")).click();
		String s = driver.findElement(By.xpath("//select[@class=\"single-select\"]/option[@value=\"Feb\"]")).getText();
		System.out.println("text of drops" + s);

	   driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.youtube.com");
	   
	}

}

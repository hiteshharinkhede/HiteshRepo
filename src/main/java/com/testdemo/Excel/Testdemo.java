package com.testdemo.Excel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testdemo {

	RemoteWebDriver driver = null;

	@Parameters("browsername ")
	@BeforeMethod
	public void browserOpen(String browsername) {
		if (browsername.equalsIgnoreCase("chrome ")) {
			driver = new ChromeDriver();

		}

		else if (browsername.equalsIgnoreCase("firefox ")) {

			driver = new FirefoxDriver();
		}

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}

}

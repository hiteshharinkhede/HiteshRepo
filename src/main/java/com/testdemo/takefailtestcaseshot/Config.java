package com.testdemo.takefailtestcaseshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Config {
public static	WebDriver driver = new ChromeDriver();

	/*@Parameters("browsename")
	@BeforeMethod
	public void openBrowser( @Optional String browsename) {

		if( browsename.isEmpty()) {
			
			browsename="chrome";
		}
		
		
		if (browsename.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browsename.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		}

	}*/

//	@AfterMethod
//	public void closeBrowser() {
//		driver.close();
//
//	}

}

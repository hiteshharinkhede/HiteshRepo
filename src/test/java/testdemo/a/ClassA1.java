package testdemo.a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ClassA1 {

	@Test(priority = -1, groups = { "sanity" }) // @Test(enabled = false)//this not take part in executionby default
												// enable is
	// true
	public void m1() { // @test (priority) apply for set priority to test by default prority is zero
						// and thoes priority less value it execute first and thoes heigh execute last
						// and loes less value considered as heigh priority

		System.out.println(" i am m1");
	}

	@Test(description = "this method has one priority") // by using describe we described perticular
														// method what it did
	public void m2() {

		System.out.println(" i am m2");
	}

	@Test(invocationCount = 5, invocationTimeOut = 500) // it want call this method how many times
	public void m3() throws InterruptedException {// this methods invoke 5 times its required invoke time is 5sec but
													// for each method =take 2sec and total take time is 10sec hence
													// fail this test case

		System.out.println(" i am m3");

		Thread.sleep(2000);

	}

	@Test(invocationCount = 0, dependsOnMethods = { "m1", "m3" }) // this method cannot take a part in execution
	private void m4() {

		System.out.println(" i am m4");
	}

	@Test(priority = 12, timeOut = 2000)
	private void m5() throws InterruptedException {
		System.out.println(" i am m5");

	}

	public void myFirsttestcase() {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com");

		driver.findElement(By.xpath("//a[@href=\"/assignments\"]")).click();

		driver.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//a[contains(text(),\"DropDown List Assignment\")]"));
		Select select = new Select(driver.findElement(By.xpath("//select[@class=\"single-select\"]")));
		select.selectByIndex(0);

	}
}

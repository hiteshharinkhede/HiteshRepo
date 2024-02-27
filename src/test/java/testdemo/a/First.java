package testdemo.a;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class First {

	@Test(expectedExceptions = { ArithmeticException.class }) // in this we write expected exeption which we want come
																// in functionality
	private void myFirst() {
		System.out.println(" my first method");
		throw new ArithmeticException();

	}

	public void printText() {

		RemoteWebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HITESH/Downloads/ImplicitWaitDemo.html");
    
		FluentWait<WebDriver> weit = new FluentWait<WebDriver>(driver);
		weit.ignoring(NoSuchElementException.class);
		weit.withTimeout(Duration.ofSeconds(60));
		WebElement click = driver.findElement(By.xpath("//button[@id = 'btn-1']"));
		weit.until(ExpectedConditions.elementToBeClickable(click));
       
		click.click();
		String s = driver.findElement(By.xpath("//button[@id = 'btn-1']")).getText();

		System.out.println(s);

	}

}

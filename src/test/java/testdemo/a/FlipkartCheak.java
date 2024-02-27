package testdemo.a;

import static com.codeborne.selenide.Selenide.open;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;

public class FlipkartCheak {// script by using selenide

	@Test
	public void toVerifylogo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();

		driver.findElement(By.xpath("//input[@type=\"text\"]")).click();

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("redmi mobile");
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		List<WebElement> phones = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		for (WebElement phone : phones) {

			String phoneprice = phone.getText();
			int price1 = Integer.parseInt(phoneprice);

			int minimum = price1;

		if(minimum<price1) {
			
			minimum=price1;
		}
		
		
		
		}

	}

}

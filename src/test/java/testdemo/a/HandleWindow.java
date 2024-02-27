package testdemo.a;

import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HandleWindow {

	@Test
	public void handlingAlert() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		RemoteWebDriver driver = new ChromeDriver(option);
		driver.get("file:///E:/Assignment%20file/HandlingMultipleWindows.html");
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		String parent_handle = driver.getWindowHandle();
		LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();

		for (String handle : handles) {

			if (!parent_handle.equals(handle)) {

				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//button[@onclick=\"clickMe()\"]")).click();
			
			String s=    driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
			System.out.println("window name"+s);
			}

		}

	}
}

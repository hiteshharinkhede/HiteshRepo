package com.testdemo.Excel;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Screenshotpage {

	@Test
	public void screenShotOfPage() throws AWTException, IOException {
		RemoteWebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
          
		Robot robo = new Robot();
		Rectangle react = new Rectangle();
		react.setBounds(0, 0, 1366, 768);

		BufferedImage image = robo.createScreenCapture(react);

		ImageIO.write(image, "jpg", new File("hitesh.jpg"));

	}

}

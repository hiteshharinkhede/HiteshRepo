package testdemo.a;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenShot {
     @Test
   public void screenShot() throws IOException, InterruptedException {
		
    	 ChromeOptions options =new ChromeOptions();
    	 options.addArguments("--remote-allow-origins=*");
    	 options.addArguments("--start-maximized");
    	 RemoteWebDriver driver=new ChromeDriver(options);
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        driver.findElement(By.cssSelector("")).getCssValue("");       
        AShot shot=new AShot();
         Thread.sleep(1000);
        Screenshot image=   shot.shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		ImageIO.write(image.getImage(), "jpg", new File("flipcard.jpg"));
		String s="ccccBBBaadOOOO";
		char [] a=s.toCharArray();
		
		
	}
	
	
	
	
	
}

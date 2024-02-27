package testdemo.a;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeScreenshot2 {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		RemoteWebDriver driver = new ChromeDriver(option);

		driver.get("https://www.flipkart.com");

		File file = driver.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(file, new File("image.png"));
	
	
	}

}

package com.testdemo.takefailtestcaseshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class Failtestcasescreenshot implements ITestListener {

@Override
public void onTestFailure(ITestResult result) {
	
 
   
   Screenshot shot=  new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(Config.driver);
            String basedir  =System.getProperty("user.dir");//current working directory in testng check..
   
   
    try {
		ImageIO.write(shot.getImage(), "jpg", new File("Screenshots/myimage.jpg"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}

}
	
	
	
	
	
	
	
}

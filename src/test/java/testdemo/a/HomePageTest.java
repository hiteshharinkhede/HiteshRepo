package testdemo.a;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.testdemo.Excel.Testdemo;

public class HomePageTest  {
   
	
	@Test
	public void toVerifyHomePageproducts() throws InterruptedException {
	RemoteWebDriver driver=new ChromeDriver();
      
	
	Thread.sleep(2000);
	driver.get("https://www.etsy.com");
	}
	
	


	
	
	
	
}

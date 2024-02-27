package testdemo.a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HandlingStaticWebTable {

	
	@Test
	public void handlingWebTable() {
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");	
		//driver.executeScript("window.ScrollBy(0,500)", " ");
		for(int row=1;row<=6;row++) {
			for(int clum=1;clum<=5;clum++) {
			WebElement	ele=driver.findElement(By.xpath("//tbody/parent::table[@class=\"dataTable\"]/thead/tr/th[5]/following::tbody/tr["+row+"]/td["+clum+"]"));
				System.out.print(ele.getText()+" ");
			}
			
			System.out.println();
			
		}

	}
	
	
	
	
	
}

package testdemo.a;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassB1 {
    @Test(groups = {"sanity","smoke"})
	public void m6() {
  System.out.println("i am m6");
	}
 
    @Test
	public void m7() {
  System.out.println(" i am m7");
	}
   
    @Test(groups = {"sanity"})//by using groups anotation use to run only thoes test cases which belongs that groups.
	public void m8() {
   System.out.println(" i am m8");
	}

	public void mySecondTestCase() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://testingshastra.com");

		String Expectedlogo = driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).getText();

		String actuallogo = "VIDEOS";

		org.testng.Assert.assertEquals(actuallogo, Expectedlogo);

		driver.close();

	}
}

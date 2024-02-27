package testdemo.a;

import org.testng.annotations.Test;

public class Data {

	@Test(dataProvider = "invention",dataProviderClass = DataProvider1.class)//right class name
	public void dataGainForScientist(String scientiest, String inventions) {// we provide parameter to test case as per
																			// column of array and it run row times of
							System.out.println("Scientist"+scientiest+" "+"Inventions"+inventions);												// array

	}

}

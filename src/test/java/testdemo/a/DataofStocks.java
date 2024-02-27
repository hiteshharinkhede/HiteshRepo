package testdemo.a;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataofStocks {

	@DataProvider
	public Object[][] dataOfStockPrices() throws IOException{
		
		return Assingment2.dataOfStockPrices("C:\\Users\\HITESH\\Downloads\\Stockprices.xls","companystocks");
	}
	
	
	
	
}

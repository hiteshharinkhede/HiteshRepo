package testdemo.a;

import java.util.HashMap;

import org.testng.annotations.Test;

public class AddDataHashmap {
      @Test(dataProviderClass = DataofStocks.class)
	public void dataProvide(String companyname,Integer stockprice) {
		HashMap< String, Integer> map1 =new HashMap<>();
		map1.put(companyname, stockprice);
		
		HashMap<String, Integer> map2=new HashMap<>();
		
	    map2.put(companyname, stockprice);
      
     
      System.out.println(map1.equals(map2));
      
      
      }
	
	
	
	
	
}

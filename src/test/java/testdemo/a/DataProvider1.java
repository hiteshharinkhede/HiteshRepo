package testdemo.a;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.testdemo.Excel.ExcelReader;
import com.testdemo.Excel.ExcelReader2;

public class DataProvider1 {

	@DataProvider(name = "invention")
	public Object[][] dataProvider() throws IOException  {// it is use to provide data to the test case
   
		ExcelReader2 reader=new ExcelReader2();
  return  reader.loadfile("E:\\Inventions of tools.xlsx","sheet");
	

	}

}

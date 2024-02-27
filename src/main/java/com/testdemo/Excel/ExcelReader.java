package com.testdemo.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelReader {

public  Object[][] loadExcelFile(String filename, String Sheetname) throws IOException {
		Object[][] obj=null;

		FileInputStream file = new FileInputStream(filename);

		XSSFWorkbook book = new XSSFWorkbook(file);
         
		XSSFSheet sheet = book.getSheet(Sheetname);
		int rows = sheet.getLastRowNum();
		
		obj=new Object[rows][sheet.getRow(0).getLastCellNum()-1];
		for (int i = 1; i <= rows; i++) {
			XSSFRow cell = sheet.getRow(i);
			int cells = cell.getLastCellNum();

			for (int j = 1; j < cells; j++) {
				XSSFCell sell = cell.getCell(j);
				obj[ i-1][ j-1] = sell.getStringCellValue();

			}

		}

		return obj;

	}


}
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	

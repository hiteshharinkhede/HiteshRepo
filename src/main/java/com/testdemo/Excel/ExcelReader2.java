package com.testdemo.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader2 {

	public Object [][] loadfile (String filename , String sheetname) throws IOException {

		Object[][] obj = null;

		FileInputStream file = new FileInputStream(filename);

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet(sheetname);

		int row = sheet.getLastRowNum();

		obj = new Object[row][sheet.getRow(0).getLastCellNum() - 1];

		for (int i = 1; i <= row; i++) {
			XSSFRow cell = sheet.getRow(i);

			for (int j = 1; j <cell.getLastCellNum(); j++) {

				XSSFCell cell1 = cell.getCell(j);

			obj[i-1][j-1]= cell1.getStringCellValue();
				
			}

		}
return obj;
	

	}

}

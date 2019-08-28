package com.varun.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(new File("C:/Users/vbele/Desktop/E_Drive_Backup_Varun/Mepo/MEPO-194/Published Contents_Updated_TEST.xlsx"));
		//Create workbook instance holding reference to .xlsx file
		Workbook workbook = new XSSFWorkbook(fi);
		
		//Get the first sheet
		Sheet sheet1 = workbook.getSheetAt(0);
		
		//Iterate each row
		Iterator<Row> rowIterator = sheet1.rowIterator();
		while (rowIterator.hasNext()) {
			Row row = (Row) rowIterator.next();
			
			//Iterate each cell
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while (cellIterator.hasNext()) {
				Cell cell = (Cell) cellIterator.next();
				System.out.print(cell.getStringCellValue() + "\t");
			}
			System.out.println();
		}
		
	}
}

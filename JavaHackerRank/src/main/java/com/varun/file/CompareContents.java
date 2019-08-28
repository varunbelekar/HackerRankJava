package com.varun.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareContents {
	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:/Users/vbele/Desktop/E_Drive_Backup_Varun/Mepo/MEPO-194/Published Contents (20).xlsx");
		Workbook workbook = new XSSFWorkbook(fi);
		Map<String, String> contentsMapTest = new LinkedHashMap<String, String>();
		Sheet sheet = workbook.getSheetAt(0);
		for (Row row : sheet) {
			contentsMapTest.put(row.getCell(0).getStringCellValue(), row.getCell(5).getStringCellValue());
		}
		
		/*for (Map.Entry<String, String> entrySet : contentsMapTest.entrySet()) {
			System.out.println(entrySet.getKey() + "\t" + entrySet.getValue());
		}*/
		
		fi = new FileInputStream("C:/Users/vbele/Desktop/E_Drive_Backup_Varun/Mepo/MEPO-194/Published Contents_Backup_QA.xlsx");
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheetAt(0);
		Map<String, String> contentsMapQa = new LinkedHashMap<String, String>();
		for (Row row : sheet) {
			contentsMapQa.put(row.getCell(0).getStringCellValue(), row.getCell(5).getStringCellValue());
		}
		
		for(String key : contentsMapTest.keySet()){
			if(!contentsMapTest.get(key).equals(contentsMapQa.get(key))){
				System.out.println(key + "\t" + contentsMapTest.get(key));
			}
		}
		
	}
}

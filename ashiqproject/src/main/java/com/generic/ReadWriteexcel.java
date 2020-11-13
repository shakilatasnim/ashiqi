package com.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteexcel {
	
	public static void main(String[] args) throws IOException {
	
	// how to handle excel file with automation
	// i used apache poi jar/library file to handle old xls like hssf and new xlsx
		// i used java file to find the path
		//i used java serialization class as FileinputStream
		// i create workbook object and sheet object
		//then i get the total row no and loop all rows
		//then i get the total column no and loop cell and get my values from excel
		
		File src = new File("C:\\Users\\alshakailin\\OneDrive\\Book 4.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("brism");
		String data= sheet.getRow(3).getCell(0).getStringCellValue();
		System.out.println("user name is: "+ data);
		int rowCount= sheet.getLastRowNum();
		
		System.out.println(rowCount);
		int columnCount = sheet.getRow(2).getLastCellNum();
		System.out.println(columnCount);
		
		
		for(int i=1;i<=rowCount;i++) {
			XSSFCell cell= sheet.getRow(i).getCell(2);
			String cellValue="";
			if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC) {
			int num=(int)cell.getNumericCellValue();
			cellValue= String.valueOf(num);
			
			}
			
			else if(cell.getCellType()==Cell.CELL_TYPE_STRING) {
			   cellValue=cell.getStringCellValue();
			}
			
			if(cell.getCellType()==Cell.CELL_TYPE_BLANK) {
				cellValue= "Empty";
						
			}
			System.out.println(cellValue);	
			
		
		}
		
		
		 
		
		
	}
         	
	
	}


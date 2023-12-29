package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Read_Excell_Data {

	
	private void read_Particular_Data() throws IOException {

		File f=new File(".\\Excell\\username&Password.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(2);
		
		Cell cell = row.getCell(2);
		
		org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

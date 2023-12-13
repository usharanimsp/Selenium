package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {
	public static void all_Data() throws IOException {
		System.out.println();
		System.out.println("All Data");
		System.out.println("========");
	File f=new File("F:\\sana_workspace\\Demo_Maven_Project\\User_Credentials.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sh = wb.getSheetAt(0);
	int noOfRows = sh.getPhysicalNumberOfRows();
	for (int i = 0; i < noOfRows ; i++) {
		Row r = sh.getRow(i);
		int noOfCells = r.getPhysicalNumberOfCells();
		for (int j = 0; j < noOfCells; j++) {
			Cell c = r.getCell(j);
			CellType ct = c.getCellType();
			if (ct.equals(CellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);
			}else if (ct.equals(CellType.NUMERIC)) {
				double value = c.getNumericCellValue();
				int val = (int) value;
				System.out.println(val);
			}
		}
	}
	}
	public static void particular_Cell_Data() throws IOException {
		System.out.println();
		System.out.println("Particular Cell Data");
		System.out.println("========");
	File f=new File("F:\\sana_workspace\\Demo_Maven_Project\\User_Credentials.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sh = wb.getSheetAt(0);
	Row r = sh.getRow(1);
	Cell c = r.getCell(1);
	CellType ct = c.getCellType();
	if (ct.equals(CellType.STRING)) {
		String value = c.getStringCellValue();
		System.out.println(value);
	}else if (ct.equals(CellType.NUMERIC)) {
		double value = c.getNumericCellValue();
		int val = (int) value;
		System.out.println(val);
	}
	}
public static void row_Data() throws IOException {
	System.out.println("Row Data");
	System.out.println("========");
File f=new File("F:\\sana_workspace\\Demo_Maven_Project\\User_Credentials.xlsx");
FileInputStream fis=new FileInputStream(f);
Workbook wb=new XSSFWorkbook(fis);
Sheet sh = wb.getSheetAt(0);
Row r = sh.getRow(0);
int noOfCells = r.getPhysicalNumberOfCells();
for (int i = 0; i < noOfCells; i++) {
	Cell c = r.getCell(i);
	CellType ct = c.getCellType();
	if (ct.equals(CellType.STRING)) {
		String value = c.getStringCellValue();
		System.out.println(value);
	}else if (ct.equals(CellType.NUMERIC)) {
		double value = c.getNumericCellValue();
		int val = (int) value;
		System.out.println(val);
	}
}
}
public static void column_Data() throws IOException {
	System.out.println();
	System.out.println("Column Data");
	System.out.println("========");
File f=new File("F:\\sana_workspace\\Demo_Maven_Project\\User_Credentials.xlsx");
FileInputStream fis=new FileInputStream(f);
Workbook wb=new XSSFWorkbook(fis);
Sheet sh = wb.getSheetAt(0);
int noOfRows = sh.getPhysicalNumberOfRows();
for (int i = 0; i < noOfRows ; i++) {
	Row r = sh.getRow(i);
	Cell c = r.getCell(1);
	CellType ct = c.getCellType();
	if (ct.equals(CellType.STRING)) {
		String value = c.getStringCellValue();
		System.out.println(value);
	}else if (ct.equals(CellType.NUMERIC)) {
		double value = c.getNumericCellValue();
		int val = (int) value;
		System.out.println(val);
	}

}
}
public static void main(String[] args) throws IOException {
row_Data();
column_Data();
all_Data();
particular_Cell_Data();
}
}

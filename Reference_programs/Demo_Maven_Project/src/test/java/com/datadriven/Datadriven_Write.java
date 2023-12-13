package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	public static void data_Write() throws IOException {
		File f=new File("F:\\sana_workspace\\Demo_Maven_Project\\User_Credentials.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh = wb.createSheet("User Data");
		wb.getSheet("User Data").createRow(0).createCell(0).setCellValue("Names");
		wb.getSheet("User Data").getRow(0).createCell(1).setCellValue("Jobs");
		wb.getSheet("User Data").createRow(1).createCell(0).setCellValue("Sana");
		wb.getSheet("User Data").getRow(1).createCell(1).setCellValue("Tester");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Success");
	}
	public static void main(String[] args) throws IOException {
		data_Write();
	}
}

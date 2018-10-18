package com.qa.exercisebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.*;

public class DemoSiteDDT {

	public void importExcel() {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TheDemoSiteConstants.Path_TestData + TheDemoSiteConstants.File_TestData);
		} catch (FileNotFoundException e) {
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException f) {
		}
		XSSFSheet sheet = workbook.getSheetAt(0);
		//for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			XSSFCell username = sheet.getRow(1).getCell(0);
			System.out.println(username.getStringCellValue());
			XSSFCell password = sheet.getRow(1).getCell(1);
			System.out.println(password.getStringCellValue());
		//}
	}
	public void exportExcel() {
		
		FileInputStream file = null;
		try {
			file = new FileInputStream(TheDemoSiteConstants.Path_TestData + TheDemoSiteConstants.File_TestData);
		} catch (FileNotFoundException e) {
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException f) {
		}
		
		FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream(TheDemoSiteConstants.Path_TestData + TheDemoSiteConstants.File_TestData);
		} catch(FileNotFoundException e) {
		}
		workbook = null;
		try {
			workbook = new XSSFWorkbook();
		} catch(IOException f) {
		}
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFCell actual = sheet.getRow(1).getCell(4);
		if(actual == null) {
			sheet.getRow(1).createCell(4);
		}
	}
}

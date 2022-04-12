package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void read_ParticularData() throws IOException {

		File f = new File("C:\\Users\\kowsalya\\eclipse-workspace\\Maven_12pm\\excel\\User_Name.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis); // UpCasting

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(1);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String data = cell.getStringCellValue();

			System.out.println(data);

		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double numeric = cell.getNumericCellValue();

			int value = (int) numeric;

			System.out.println(value);

		}

	}

	public static void main(String[] args) throws IOException {

		read_ParticularData();

	}

}

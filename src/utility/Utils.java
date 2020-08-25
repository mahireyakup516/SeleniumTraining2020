package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import findingElement.UserInfo;


public class Utils {
	public static UserInfo readInfoFromExcel(String fn) throws Exception {
	
		FileInputStream fr=new FileInputStream("C:\\study-java\\Selenium Training 2020\\Data\\register.xlsx");
		XSSFWorkbook workbook;
	
			workbook = new XSSFWorkbook(fr);
			XSSFSheet sh1=workbook.getSheetAt(0);
		
		Row curRow=sh1.getRow(1);
		UserInfo curUsr=new  UserInfo();
		DataFormatter formatter= new DataFormatter();
		curUsr.setFirstName(curRow.getCell(0).getStringCellValue());
		curUsr.setLastName(curRow.getCell(1).getStringCellValue());
		curUsr.setEmail(curRow.getCell(2).getStringCellValue());
		curUsr.setGender(curRow.getCell(3).getStringCellValue());
		curUsr.setMobile(formatter.formatCellValue(curRow.getCell(4)));
		String birthday=formatter.formatCellValue(curRow.getCell(5));
		curUsr.setDateOfBirth(birthday);
		curUsr.setSubjects(curRow.getCell(6).getStringCellValue());
		curUsr.setHobbies(curRow.getCell(7).getStringCellValue());
		curUsr.setPicture(curRow.getCell(8).getStringCellValue());
		curUsr.setCurrentAddress(curRow.getCell(9).getStringCellValue());
		curUsr.setState(curRow.getCell(10).getStringCellValue());
		curUsr.setCity(curRow.getCell(11).getStringCellValue());
		
		return curUsr;
		
		
	}
	
	
		
		
}

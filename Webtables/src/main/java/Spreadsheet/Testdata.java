package Spreadsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Webtableslocator.Inspectlocators;

public class Testdata 
{
	public XSSFSheet sheet;
	public Testdata() throws Exception
	{
	  Inspectlocators inspect = new Inspectlocators();
	 File file = new File(inspect.prop.getProperty("excelpath"));
	 FileInputStream fs = new FileInputStream(file);
	 XSSFWorkbook wb = new XSSFWorkbook(fs);
	 XSSFSheet sheet = wb.getSheet("Sheet1");
	 this.sheet=sheet; 
	}

	public String getColHead()
	{
		String cell = sheet.getRow(0).getCell(0).getStringCellValue();
				return cell;
//		String cell="First Name";
//		return cell;
		
	}





}





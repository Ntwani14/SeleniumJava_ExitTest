package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public excelUtils(String excelPath, String sheetName)
	{
		try {
		
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static int getrowCount()
	{
		
		int rowCount=0;
		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			
			//System.out.println("No of row count " + rowCount);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		return rowCount;
	}
	
	public static int getcolCount()
	{
		int colCount=0;
		
		try {
			
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			
			//System.out.println("No of col count: " + colCount);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		return colCount;
	}

	public static String getCellDataString(int rowNum, int colNum)
	{
		String cellData = null;
		
		try {
			
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("cell data "+cellData);
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		return cellData;
	}
	
	public static void getCellDataNumber(int rowNum, int colNum)
	{
		try {
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			
			System.out.println("cell data "+cellData);
			
			}catch(Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
	}
}

package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	String projectPath = System.getProperty("user.dir");
	String excelPath = projectPath+"/excel/data.xlsx";
	String sheetName = "Sheet1";
	
	@Test(dataProvider = "test1data")
	public void test1(String email, String password)
	{
		System.out.println(email+" | "+password);
	}
	

	@DataProvider(name = "test1data")
	public Object[][] getData()
	{
		
	
		Object data[][] = testData(excelPath, sheetName);
		return data;
	}

	public Object[][] testData(String excelPath, String sheetName)
	{
		excelUtils excel = new excelUtils(excelPath, sheetName);

		int rowCount = excel.getrowCount();
		int colCount = excel.getcolCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for(int i =1;i<rowCount;i++)
		{
			for(int j =0;j<colCount;j++){

				String cellData = excel.getCellDataString(i, j);

				data[i-1][j] = cellData;

			}
		}
		return data;
	}
}

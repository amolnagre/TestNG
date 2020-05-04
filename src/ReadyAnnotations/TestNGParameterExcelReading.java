package ReadyAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterExcelReading {
	
	public static ExcelReader excel= null;// Required ExcelReader customize file paste into package
	
	
	@Test(dataProvider="getData")
	public void testFormFill(String username,String password,String is_correct)
	{
		System.out.println(username+"---"+password+"---"+is_correct);
	}
	
	@DataProvider
	public Object [][] getData()
	{
		if(excel==null){
			excel=new ExcelReader("C:\\WebDrivers\\Excel Read Write file TestNg\\ExcelReaderTestNG.xlsx");//Excel file path for reading Excel file
		}
		
		String sheetName="LoginTest";// Sheet Name into Excel file
		int rows=excel.getRowCount(sheetName);
		
		int cols=excel.getColumnCount(sheetName);
		
		
		
	Object[][] data = new Object[rows-1][cols];
	
	for(int rowNum=2;rowNum<=rows;rowNum++)
	{
		for(int colNum=0;colNum<cols;colNum++){
			
			data[rowNum-2][colNum] = excel.getCellData(sheetName,colNum,rowNum);
		}
	}
	return data;
	}

}

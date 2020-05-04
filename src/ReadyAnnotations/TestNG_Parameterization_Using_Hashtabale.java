package ReadyAnnotations;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_Parameterization_Using_Hashtabale {
	
	
	public static ExcelReader excel= null;// Required ExcelReader customize file paste into package
	
	
	@Test(dataProvider="getData")
	public void testFormFill(Hashtable<String,String> data)
	{
		System.out.println(data.get("username")+"---"+data.get("password")+"---"+data.get("is_correct")+"---"+data.get("Age")+"---"+data.get("Gender"));
		
	}
	
	@DataProvider
	public Object [][] getData()
	{
		if(excel==null){
			excel=new ExcelReader("C:\\WebDrivers\\Excel Read Write file TestNg\\TestNGParameterUsingHashtable.xlsx");//Excel file path for reading Excel file
		}
		
		String sheetName="LoginTest";// Sheet Name into Excel file
		int rows=excel.getRowCount(sheetName);
		
		int cols=excel.getColumnCount(sheetName);
		
		
		// first Changes to cols=1
	Object[][] data = new Object[rows-1][1];
	
	Hashtable<String,String> table=null;
	
	
	for(int rowNum=2;rowNum<=rows;rowNum++)
	{
		table= new Hashtable<String,String>();
		
		for(int colNum=0;colNum<cols;colNum++){
			//
			//data[rowNum-2][colNum] = excel.getCellData(sheetName,colNum,rowNum);
			table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
			data[rowNum-2][0] = table;
		}
	}
	return data;
	}


}

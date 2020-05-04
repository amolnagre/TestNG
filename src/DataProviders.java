

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DataProviders {
	
	/*@Test(dataProvider="dp1")
	public void testData(String username,String password)
	{
		System.out.println(username+"----"+password);
	}*/
	
	/*
	@DataProvider(name="dp1")// given to name of DataProviders for passing name dp1 to testcase
	public static Object[][] getData()// getData methods
	{
	Object [][] data = new Object[2][2];
	data[0][0] = "Anagre77@gmail.com";
	data[0][1] = "@mol123";
	
	
	data[1][0] = "Mangeshsontake@gmail.com"; 
	data[1][1] ="M@ngesh123";
	
	return data;
	}

	@DataProvider(name="dp2")// given to name of DataProviders for passing name dp2 to testcase
	
	public static Object[][] getData2()
	{
	Object [][] data = new Object[2][3];
	
	data[0][0] = "Amol";
	data[0][1] = "Nagre";
	data[0][2] = "Anagre77@gmail.com";
	
	
	data[1][0] =  "Mangesh";
	data[1][1] ="Sontakke";
	data[1][2] ="Mangeshsontake@gmail.com";
	
	return data;
	}
*/
	// using single DataProvider dp1 and passing 2 different getData() 2 parameters(name,password)
	//and getData 3 parametes(firstname,lastname,email using single DataProvider name "dp1"
	
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m){
		Object[][] data = null;
		
		if(m.getName().equals("testData"))
		{
			data = new Object[2][2];
			
			data[0][0] = "Anagre77@gmail.com";
			data[0][1] = "@mol123";
			
			
			data[1][0] = "Mangeshsontake@gmail.com"; 
			data[1][1] ="M@ngesh123";
			
		}
		else if(m.getName().equals("testRegistration"))
			{
			data = new Object[2][3];
			
			data[0][0] = "Amol";
			data[0][1] = "Nagre";
			data[0][2] = "Anagre77@gmail.com";
			
			
			data[1][0] =  "Mangesh";
			data[1][1] ="Sontakke";
			data[1][2] ="Mangeshsontake@gmail.com";

			}
		return data;
	}
}

package ReadyAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	/*@Test(dataProvider="dp1")
	public void testData(String username,String password)
	{
		System.out.println(username+"----"+password);
	}*/
	
	
	@DataProvider(name="dp1")
	public Object[][] getData()
	{
	Object [][] data = new Object[2][2];
	data[0][0] = "Anagre77@gmail.com";
	data[0][1] = "@mol123";
	
	
	data[1][0] = "Mangeshsontake@gmail.com"; 
	data[1][1] ="M@ngesh123";
	
	return data;
	}

	/*@DataProvider(name="dp2")
	
	public Object[][] getData2()
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

}

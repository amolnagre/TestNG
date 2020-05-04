import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_Parameters {

	@Test(dataProvider ="getData")
	public void testFormFIll(String Username,String Password,Integer age)
	{
		System.out.println(Username+"---"+Password+"---"+age);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
	Object [][] data = new Object[2][3];
	data[0][0] = "Anagre77@gmail.com";
	data[0][1] = "@mol123";
	data[0][2] = 32;
	
	data[1][0] = "Mangeshsontake@gmail.com"; 
	data[1][1] ="M@ngesh123";
	data[1][2] =28;
	return data;
	}
}

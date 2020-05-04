package ReadyAnnotations;

import org.testng.annotations.Test;

public class NewLoginTest {
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void testData(String username,String password)
	{
		System.out.println(username+"----"+password);
	}
	/*
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void testRegistration(String firstname,String lastname,String email)
	{
		System.out.println(firstname+"----"+lastname+"----"+email);
	}*/
	

}

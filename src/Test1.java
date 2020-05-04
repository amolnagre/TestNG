import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	
		@Test
		public void testLogin()
		{
			System.out.println("Testing Login Screen");
		}
		
		@Test
		public void testFormFill()
		{
			System.out.println("Testing Registratin form");
		}
		
		// Before Annotation is called before excuting every testcase
		@BeforeMethod
		public void OpneBrowser(){
			System.out.println("Opening Browser");
		}
		
		// After Annotation is called after executing each and every testcase
		@AfterMethod
		public void CloseBrowser()
		{
			System.out.println("Clossing Browser");
		}
		
		// BeforeTest Annotation will be called before 'BeforeMethod' annotation and 
		//and befor calling any testcase (it will call only once)
		@BeforeTest
		public void OpenDbConncetion()
		{
			System.out.println("Create DB Connection");
		}
		
		//AfterTest annotation will be called after calling all testcases
		// it will called only once
		@AfterTest
		public void CloseDbConnection()
		{
			System.out.println("Clossing DB Connection");
		}
		
		//Suite Means More than once Classes
		@BeforeSuite
		public void StartSeleniumSever()
		{
			System.out.println("Stating Selenium Server");
		}
		
		@AfterSuite
		public void StopSeleniumSever()
		{
			System.out.println("Stopping Selenium Server");
		}
		
	}



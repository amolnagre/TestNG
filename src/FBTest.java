import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FBTest {

	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void LaunchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");// for opening a site which we want to open on chrome
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
		//Locator ID
		driver.findElement(By.id("email")).sendKeys("amolnagre13@gmail.com");
		
		//Locator Name
		driver.findElement(By.name("pass")).sendKeys("AmolNagre");
		
		//Locator=Xpath of Login Button
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
	
		//driver.close();
	}
}

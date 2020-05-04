import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void testCaptureScreen()
	{
		System.out.println("Capturing ScreenShots");
		throw new SkipException("Skipping this testcase...");
	}
	
	
	
	
	
	
}

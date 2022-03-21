package automationFramework;


//import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
//import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;		

@Listeners(automationFramework.ListenerTest.class)	
public class ListenerTestCases {
	//String driverPath ="C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe";
	public WebDriver driver;
	
	// Test to pass as to verify listeners .		
	@Test		
	public void TestToPass()				
	{		
		System.out.println("This method to test pass");
		Assert.assertTrue(true);
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}		
	}

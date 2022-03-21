package automationFramework;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestngTest4 {
	@Test
	public class firsttestngfile {
	    public String baseUrl = "https://www.selenium.dev/";
	    String driverPath ="C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe";
		public WebDriver driver;
	    public String expected = null;
	    public String actual = null;
	        @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching chrome browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver= new ChromeDriver();
	          driver.get(baseUrl);
	      }
	      
	      @BeforeMethod
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Selenium";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	      }
	          @Test(priority = 0)
	      public void download(){
	          driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a")).click() ;
	          expected = "Downloads | Selenium";
	          actual = driver.getTitle();
	          Assert.assertEquals(actual, expected);
	          System.out.println("download done");
	      }
	          @Test(priority = 1)
	      public void documentation() {
	            driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[4]/a/span")).click() ;
	            expected = "The Selenium Browser Automation Project | Selenium";
	            actual = driver.getTitle();
	            Assert.assertEquals(actual, expected);
	            System.out.println("documentation done");
	      }
	      @AfterMethod
	      public void goBackToHomepage ( ) {
	    	  driver.navigate().back();
	      }
	       
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
	      }
	}
}
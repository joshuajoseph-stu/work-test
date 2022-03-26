package TestngPkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wiki2 {
	public String baseUrl = "https://en.wikipedia.org/wiki/South_Main_Street_District_(Middletown,_Ohio)";
	String driverPath ="C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe";
	public WebDriver driver;
	
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
          driver.get(baseUrl);
      }
      @Test
      public void verifyHomepageTitle() {
          String expectedTitle = "South Main Street District (Middletown, Ohio) - Wikipedia";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}
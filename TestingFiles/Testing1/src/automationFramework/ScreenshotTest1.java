package automationFramework;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ScreenshotTest1 {

	public static void main(String[] args) throws Exception 					
    {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();	
    	

        //goto url

    	 driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");

        //Call take screenshot function

        takeSnapShot(driver, "C:\\Users\\Joshua Joseph\\Desktop\\crazy\\WORK\\work-test\\Specialization stuff\\Testing\\Testing1.png") ;     

    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}
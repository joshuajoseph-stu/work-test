package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FifthTestCase {
	 public static void main(String[] args){
         //set the location of chrome browser from the local machine path
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
         
         //navigate to url
         driver.get("https://demoqa.com/frames");
         
         //Switch to Frame using id of the frame
         driver.switchTo().frame("frame1");
         
         //Identifying the heading in webelement
         WebElement frame1Heading= driver.findElement(By.id("sampleHeading"));
         
         //Finding the text of the heading
         String frame1Text=frame1Heading.getText();
         
         //Print the heading text
         System.out.println(frame1Text);
         
         //closing the driver
         driver.close();
 }
}
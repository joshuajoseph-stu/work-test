package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WikiScrollTes {

	public static void main(String[] args) 					
    {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();	
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application		
        driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");

        //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.id("Java"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
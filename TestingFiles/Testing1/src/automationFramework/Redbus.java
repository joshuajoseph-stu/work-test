package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Redbus{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chromedriver version ChromeDriver 99.0.4844.51
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open google
		driver.get("https://www.redbus.in/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//get title and print to console
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		
		//to click the arrow button	
		WebElement drop = driver.findElement(By.id("sign-in-icon-down"));
		drop.click();
		//to click sign in/sign up
		WebElement signlink = driver.findElement(By.id("signInLink"));
		signlink.click();
		
		
	}
}

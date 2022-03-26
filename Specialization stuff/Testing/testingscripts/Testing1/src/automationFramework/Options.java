package automationFramework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Options{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chromedriver version ChromeDriver 99.0.4844.51
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open site
		driver.get("https://demoqa.com/select-menu");
		
		//maximize window
		driver.manage().window().maximize();
		
		//get title and print to console
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		
		Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
//		selects yellow
//		se.selectByIndex(3); 
//		selects red
//		se.selectByValue("9"); 
//		selects white
		se.selectByVisibleText("White");
		//to get all options
		List<WebElement> options = se.getOptions();
		for ( WebElement elem : options ) {
			  System.out.println("Element : "+elem.getText());
			}
		
		

	}
}

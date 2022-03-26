package automationFramework;



import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chromedriver version ChromeDriver 99.0.4844.51
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ALERT
		//open site
		driver.get("https://demoqa.com/alerts");
		
		//maximize window
		driver.manage().window().maximize();
		
		//get title and print to console
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		driver.findElement(By.id("alertButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		System.out.println("Alert Accepted");
		//end of alert
	}
}
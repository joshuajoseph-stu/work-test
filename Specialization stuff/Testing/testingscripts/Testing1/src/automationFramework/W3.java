package automationFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class W3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chromedriver version ChromeDriver 99.0.4844.51
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joshua Joseph\\eclipse-workspace2\\Testing1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open google
		driver.get("https://www.w3schools.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//get title and print to console
		String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		
		//to click the arrow button	
		//WebElement drop = driver.findElement(By.id("sign-in-icon-down"));
		//drop.click();
		//to click sign in/sign up
		driver.findElement(By.id("w3loginbtn")).click();
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//sending username
		driver.findElement(By.id("modalusername")).sendKeys("joshuajoseph1012@gmail.com");
		//sending pass
		driver.findElement(By.id("current-password")).sendKeys("Meatballz139@");
		//clicking login
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button"));
		String linkText = loginbtn.getText();
		System.out.println("Login button has text: "+linkText);
		loginbtn.click();	
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("MainHeader_browseLink__2U9dm btn btn-light")));
		
		String CurrentUrl = driver.getCurrentUrl();
		String NewTitle = driver.getTitle();
		System.out.println("Title is : "+NewTitle+" and current url is : "+CurrentUrl);
		
		//driver.close();
	}
}

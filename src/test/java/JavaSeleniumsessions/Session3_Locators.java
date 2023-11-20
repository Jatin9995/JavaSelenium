package JavaSeleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session3_Locators {

	public static void main(String[] args) {

		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jatin\\\\new Eclipse\\\\Chromedriver\\\\driver_Chrome\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximize the size of window
		driver.manage().window().maximize();
		
		//open webpage saucedemo.com
	driver.navigate().to("https://www.saucedemo.com/");	
		
	//id & Password=standard_user, secret_sauce
	
	//Locate user name by id
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	//Locate password by name
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	
	//Locate submit button by class
	driver.findElement(By.className("submit-button")).click();
	
	//switch to product page, we need to get the window handle to switch to product page
	String currentWindow=driver.getWindowHandle();
	driver.switchTo().window(currentWindow);
	
	//Locate Sauce Labs Bolt T-Shirt, LinkText is used because its a product link, Partial linktext can also used
	//driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
	
	//to know the size of the elements like how many time "Sauce" world used in link we use findelements method.
	
	List <WebElement> elementslist=driver.findElements(By.partialLinkText("Sauce"));
	System.out.println("Size of elements:"+ elementslist.size()); 
	
		
		
	}

}

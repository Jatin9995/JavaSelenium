package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session5_Locators_Xpath {

	public static void main(String[] args) {

		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Launch https://www.saucedemo.com/ webpage
		driver.navigate().to("https://www.saucedemo.com/");
		
		//Locate user name using single attribute syntax--//tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	
		
		//Locate password using multiple attribute syntax--//tagname[@attribute1='value1'][attribute2='value2']
		driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");
		
		//Locate login button using single attribute syntax--//tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//To switched to product, take the window handle first
		String currentWindowhandle=driver.getWindowHandle();
		driver.switchTo().window(currentWindowhandle);
		
		////Locate add to cart button by AND , OR condition. In AND condition both the attribute value should be true. In OR condition any one condition should be true.
//Locate add to cart using AND condition
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' and @name='add-to-cart-sauce-labs-backpack']")).click();
		
//Locate add to cart using OR condition
driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt' or @name='add-to-cart-sauce-labs-bolt-t-shirt']")).click();	
		
		//contains method is used to locate the elements using partial text, syntax--tag[contains(@attribute,'attribute value')]

//For user name syntax will be--driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		
		//starts-with method for user name syntax--tagname[starts-with(@attribute,'initial value')]
//driver.findElement(By.xpath("////input[starts-with(@name,'user')]")).sendKeys("standard_user");

//text method, it is used to select the text on the webpage syntx--//*[text()='text which you want to select']
//driver.findElement(By.xpath("////*[text()='Accepted usernames are:']"));

//Position method
//xpath using position syntax--tagname[@attribute-type='attribute value'][position()=value]
//xpath using last syntax--tagname[@attribute-type='attribute value'][last()=value]
//input[@type='text'][last()]
		
		
	}

}

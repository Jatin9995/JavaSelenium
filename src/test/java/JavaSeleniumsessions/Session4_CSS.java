package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session4_CSS {

	public static void main(String[] args) {

		//Launch chrome brower
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		//open webpage saucedemo.com
driver.navigate().to("https://www.saucedemo.com/");

//Locate user name tag & id syntax---tag#id
driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

//Locate password by tag name & attribute syntax--tag[attribute=attribute value];
driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");

//Locate login button by tagname & class syntax--tag.value of class
driver.findElement(By.cssSelector("input.submit-button")).click();

//switch to product page, we need to get the window handle to switch to product page
String currentWindowhandle=driver.getWindowHandle();
driver.switchTo().window(currentWindowhandle);

//Locate add to cart button by tag, class & attribute syntax--tag.value of class[attribute=value of attribute]
driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();

//Locate add to cart using substring method.
//start with syntax--tag[attribute^=substring]
//end with syntax--tag[attribute$=substring]
//contain with syntax--tag[attribute*=substring]
driver.findElement(By.cssSelector("button[name$=light]")).click();



		
	}

}

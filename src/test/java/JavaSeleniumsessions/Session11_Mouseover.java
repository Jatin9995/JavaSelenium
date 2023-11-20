package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session11_Mouseover {

	public static void main(String[] args) {

		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//maximize window
		driver.manage().window().maximize();

		//to wait untill webelements load
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Launch webpage--http://https://demoqa.com/buttons/
		driver.navigate().to("https://sellglobal.ebay.in/seller-center/start-selling/");
		
		//We need to make an object of  webelement to save the retun web element
		
		WebElement element=driver.findElement(By.linkText("Marketing & Promotion"));
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Increase visibility with Promoted Listings")).click();
		
		
	}

}

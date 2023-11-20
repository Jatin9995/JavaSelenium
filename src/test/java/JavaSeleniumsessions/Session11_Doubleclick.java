package JavaSeleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session11_Doubleclick {

	public static void main(String[] args) {

		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		//maximize window
		driver.manage().window().maximize();

		//to wait untill webelements load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Launch webpage--http://https://demoqa.com/buttons/
		driver.navigate().to("https://demoqa.com/buttons");
		
		////we need to doubleclick on button and normal click cannot do the double click operation. we have to use the find element 
		//method which will return a web element which we have to save in an object.
		WebElement button=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		////created object of action class to double click bcoz action class is used in mouse operations
		Actions act=new Actions(driver);//created object of an action class
		act.doubleClick(button).build().perform();//double click is used for double click operation
		
		
		
		
	}

}

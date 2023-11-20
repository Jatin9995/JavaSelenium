package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session21_Howtoscrollwebpage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.calculator.net/");

		//to scroll using selenium, you can use JaveScriptExecutor interface that helps to execute JavaScript methods through Selenium WebDriver.
		//Syntax:- JavaScriptExecutor js=(JavaScriptExecutor) driver;
		//js.executeScript("window.scrollBy(x-pixels,y-pixels)");


		//JavaScriptExecutor interface is used to scroll down the webpage
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		//(1)Scroll vertically down by 500 pixels, 500 y axis, 0 x axis 
		//js.executeScript("window.scrollBy(0,500)");

		//(2)To scroll down the webpage by the visibility of the webelement
		//js.executeScript("arguments[0].scrollIntoView();", Element);

//WebElement element = driver.findElement(By.linkText("BMI Calculator"));
//js.executeScript("arguments[0].scrollIntoView();", element);
		
		//(3) To Scroll down the webpage at the bottom of the page
//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		//(4) Horizontal scroll on the webpage
		//js.executeScript("arguments[0].scrollIntoView();", element);
//same as above methods
		
	}

}

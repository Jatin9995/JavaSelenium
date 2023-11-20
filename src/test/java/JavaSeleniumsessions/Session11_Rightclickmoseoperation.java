package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session11_Rightclickmoseoperation {

	public static void main(String[] args) {

		//Launch Chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();

				//maximize window
				driver.manage().window().maximize();

				//to wait untill webelements load
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				//Launch webpage--http://https://demoqa.com/buttons/
				driver.navigate().to("https://demoqa.com/buttons");

				//we need to rightclick on button and normal click cannot do the right click operation. we have to use the ffind elements 
				//method which will return a web element which we have to save in an object.

				WebElement button=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));//object created of webelement
				Actions act=new Actions(driver);//created object of action class to right click bcoz action class is used in mouse operations
				act.contextClick(button).perform();//right click action  // 

				//contectClick is used for the right click operation.
				//perform is used to click on button.

		
	}

}

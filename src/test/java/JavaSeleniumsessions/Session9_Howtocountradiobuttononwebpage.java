package JavaSeleniumsessions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session9_Howtocountradiobuttononwebpage {

	public static void main(String[] args) {

		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "J:\\\\eclipse_Jdrive\\\\Chrome\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//Maximize chrome window
				driver.manage().window().maximize();
				
				//Wait for 10 seconds so that webelements load and links load webpage 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
				
				//Launch webpage--http://www.deadlinkcity.com/
				driver.navigate().to("https://udyamregistration.gov.in/Udyam_Login.aspx");
				
				//find radio button web element on webpage
				List<WebElement> allRadiobutton=driver.findElements(By.xpath("//input[@type='radio']"));
				
				//print total no. of radio button
				System.out.println("Total radio button:"+ allRadiobutton.size());
		
				
				
				
//				for(WebElement el:allRadiobutton) {
//					System.out.println(el.getText());
//				}
//				
				//close the browser

		
		
	}

}

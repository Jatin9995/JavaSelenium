package JavaSeleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session10_Howtoclickonimage {

	public static void main(String[] args) {

		//Open Chrome 
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Maximize the window size
		driver.manage().window().maximize();
				
		//Open webpage opencart.com
		driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
		
		//waiting timeframe
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find webelement open cart image link open cart
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		
		//verify title of the current page after clicking on open cart image with the expected title
		
		if(driver.getCurrentUrl().equals("https://www.opencart.com/index.php?route=common/home")) {
			System.out.println("Test Passed");
		}
		
		else {
			System.out.println("Test Failed");
		}
		
		driver.close();
	}

}

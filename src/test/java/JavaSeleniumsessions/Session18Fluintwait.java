package JavaSeleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Stopwatch;

public class Session18Fluintwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "J:\\\\eclipse_Jdrive\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://sellglobal.ebay.in/seller-center/");
		Stopwatch watch=null;
		try {
		watch=Stopwatch.createStarted();//stopwatch started
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)  //method of fluintwait
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(2))
			.withMessage("This is custom message") // this is optional
			.ignoring(NoSuchElementException.class);
	
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING1"))); 
	   element.click();
		}
		catch (Exception e) {
		
		watch.stop();
		System.out.println(e);
		System.out.println("wait time"+  watch.elapsed(TimeUnit.SECONDS));
		}
		
	}

}

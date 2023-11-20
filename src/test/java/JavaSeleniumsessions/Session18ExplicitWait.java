package JavaSeleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Session18ExplicitWait {

	public static void main(String[] args) {

		//Explicit wait	:-explicit wait webelement specific hota hai.Explicit wait waha use hota  hia jo webelement jayad time lete hai load hone me
		//kyu ki explicit wait webelement specific hota hai.explicit wait me hum expected condition bhi specify kar sakte hai.
		//explicit wait ko apply karne k liye hum WebDriverWait class ka use karte hai.	
		//Syntax:- WenDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time))

		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://sellglobal.ebay.in/seller-center/start-selling/");
	Stopwatch watch=null;
		
//////////////////////*********************Explicitwait************************//////////////////////////		
		
		try {
		watch=Stopwatch.createStarted();  //stopwatch started
		
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));  //syntax of expicitwait
   WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING"))); //method of explicitwait
   element.click();
		
		}
		
		catch(Exception e) {
			
watch.stop();  //staopwatch end
System.out.println(e);
   System.out.println(watch.elapsed(TimeUnit.SECONDS));          //print time time gap

		}
		
		
		



	}

}

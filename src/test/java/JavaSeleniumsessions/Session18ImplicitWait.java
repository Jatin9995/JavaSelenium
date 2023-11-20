package JavaSeleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



import com.google.common.base.Stopwatch;

public class Session18ImplicitWait {

	public static void main(String[] args) {

		//synchorinization:-process of matching the test automation tool speed with the speed of application under test is called
		//sunchronization.
		//three types of wait
		//1. implicit wait:- its a global wait.if we use implicit wait then it will automatically apply on every webelement.
		//	syntax:-driver.manage().timeouts().implicitlyWait(Duration.ofSeconds());
		//give "Nosuchelementfound" exception error if not found the element within the timeframe.implicit wait is the maximum time between two command.
		//it is not necessary that implict will wait for maximum time. if the element is available then it will perform action
		//2. explicit wait:-it is webelement specific.
		//3.Fluent wait
		//implicit wait ka advantage ye hai ki hum ek bar apply karte hai and saare webelememts pe applicable ho jata hai. ye global wait hota hai.
		//ye bohot simple hai and easy to use hai.
		//iska disadvange ye hai ki iska time hum hardcode karte hai. agar webelement ko load hone  me jo time humne mention kiya hai wait me us se jayada lagta hai to
		// ye exception throw karega.





		//////////////*************Launch chrome browser**************************///////////////////////

		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://sellglobal.ebay.in/seller-center/start-selling/");

		//////////////////////*********************Implicitwait**************************************/////////////////////

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Stopwatch watch=null;
		try {            ///We have used try & catch as incase of wrong webelement it will through an exception wo we have to capture the time.
			watch=Stopwatch.createStarted(); // Stopwatch start. It is used to note down the time

			driver.findElement(By.linkText("START SELLING")).click();//if the element is wrong the it will take complete mentioned time else it will click before the mentiond time.
		}
		
		catch(Exception e) {

			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds ");//print time time gap
		}
	}	


}


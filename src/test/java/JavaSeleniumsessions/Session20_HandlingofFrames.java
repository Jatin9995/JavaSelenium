package JavaSeleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session20_HandlingofFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");		
		//Process to enter into the frame. first find the main frame and switch to that frame



		WebElement frame1=driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(frame1);
	
		
		
		//click on webelement inside the frame
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
		
		
		//if want to click on another web element which is available in different frame then you have to first come into the main window
//after coming into the main window you have to switch to another frame.
	//process to come into the main window
driver.switchTo().defaultContent();//this method will move the control from frame to either frameset or in html dom

//process to enter into frame 2
	WebElement frame2=driver.findElement(By.name("packageFrame"));
	driver.switchTo().frame(frame2);
	
	//click on webelement available in frame2
	
	driver.findElement(By.xpath("//span[text()='Capabilities']")).click();
	
	driver.switchTo().defaultContent();
	
	WebElement frame3 = driver.findElement(By.name("classFrame"));
	driver.switchTo().frame(frame3);
	
	driver.findElement(By.xpath("//a[@href='remote/AbstractDriverOptions.html']")).click();
	
	
	
	

		
		

		
		
		
	}

}

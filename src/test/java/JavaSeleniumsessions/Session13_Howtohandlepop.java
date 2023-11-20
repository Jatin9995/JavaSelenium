package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session13_Howtohandlepop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Simple Alert:- find alert button and perform click operation
		//driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		//after clicking , you need to come into a alert window by pressing ok
		//driver.switchTo().alert().accept();//ok pressed to come into alert window.
		
		//Confirmation Alert:- find the confirmation button and perform click operation
//		driver.findElement(By.id("confirmbtn")).click();
//		Thread.sleep(2000);
//		
		//after clicking , you need to come into a alert window by pressing ok
    // driver.switchTo().alert().accept();
     
     //Prompt button operation. Write name
		
		driver.findElement(By.id("name")).sendKeys("Jatin Rout");
		Thread.sleep(2000);
		//click on alert
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		//click on ok
		driver.switchTo().alert().accept();
					
		
		
	}

}

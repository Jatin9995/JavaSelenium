package JavaSeleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Testwindowhandle{

	public static void main(String[] args) {
		
		WebDriver driver;

		//Launch Chrome browser
				System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
				driver=new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Launch opencart.com
				driver.navigate().to("https://www.opencart.com/");
				
				String Parentwinid = driver.getWindowHandle();
				System.out.println("Parent window Title:- " + driver.getTitle());
				System.out.println("Parent Window ID:-" + Parentwinid);
				
				driver.findElement(By.xpath("//img[@src='application/view/image/home/brand/cxracing.png']")).click();
				
				
			Set<String> windowhandle = driver.getWindowHandles();
			System.out.println(windowhandle.size());
			List<String> handle = new ArrayList<String>();
			handle.addAll(windowhandle);
	driver.switchTo().window(handle.get(1));
	System.out.println("New window title:-" + driver.getTitle());
	String ChildWindowID = driver.getWindowHandle();
	System.out.println("Childwinid:- "+ ChildWindowID);
			
	driver.findElement(By.xpath("//span[normalize-space()='Checkout']")).click();
	driver.close();
	
	driver.switchTo().window(handle.get(0));
	
	System.out.println("Again Parent window Title:- " + driver.getTitle());
	System.out.println("Again Parent Window ID:-" + Parentwinid);

				driver.quit();
				
}

	
}
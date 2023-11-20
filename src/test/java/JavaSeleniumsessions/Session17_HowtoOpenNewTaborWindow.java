package JavaSeleniumsessions;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Session17_HowtoOpenNewTaborWindow {

	public static void main(String[] args) {
		WebDriver driver;
		//in selenium version 4, you can open new window & tab using "newWindow" command.
		//ex:-open new window:-driver.switchTo().newWindow(WindowType.WINDOW)
		//open new TAB:- driver.switchTo.newWindow(WindowType.TAB)

		//open first window google.com
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		String Title = driver.getTitle();
		System.out.println(" First Page Title "  +  Title);

		//Open new tab on same browser

		driver.switchTo().newWindow(WindowType.TAB)	;	
	
		driver.navigate().to("https://www.facebook.com/");
		String Title2 = driver.getTitle();
		System.out.println(" Second Tab title "  +  Title2 );

		//get window handles of open windows

		Set<String> windowhandles = driver.getWindowHandles();

		//Save the window handles in the arrays list so that we can use it
		List<String> handle= new ArrayList<String>();
		handle.addAll(windowhandles);

		driver.close(); //for closing the facebook.com
		
		//wapus google.com me jaane k liye
		driver.switchTo().window(handle.get(0));// get(0) means ki first window google.com the and uska index no. 0 hoga bcoz array use hus h isme.
		System.out.println(" Again first title " + driver.getTitle());
		
		
		
		

	}

}

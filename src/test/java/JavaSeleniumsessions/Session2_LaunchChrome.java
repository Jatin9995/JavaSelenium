package JavaSeleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session2_LaunchChrome {

	public static void main(String[] args) {

		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedrive\\crome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Maximize the size of Chrome browser (Syntax)
		driver.manage().window().maximize();
		
		//Launch Google.com (Syntax)
		driver.navigate().to("https:\\www.google.com");
		
		//Launch facebook.com (Syntax)
		driver.navigate().to("https:\\www.facebook.com");
		
		//backword syntax
		driver.navigate().back();
		
		//forward syntax
		driver.navigate().forward();
		
		//refresh syntax
		driver.navigate().refresh();
		
		//Capture title of webpage and print (Syntax)
		String title=driver.getTitle();
		System.out.println("Title of the webpage:"+title);
		
		//Capture URL of the webpage and print (Syntax)
		String url=driver.getCurrentUrl();
		System.out.println("URL of the webpage:"+url);
		
		//Capture page source and print
		//String pagesource=driver.getPageSource();
	//	System.out.println("Page source:"+pagesource);
		
		String handle=driver.getWindowHandle();
		System.out.println("Window handle id:"+handle);



}
		
		

	}



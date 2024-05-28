package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Session47_HeadlessBrowser {
	
	@Test
	
	public void launchHeadlessbroswer() {
		
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		
driver.navigate().to("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("locked_out_user");
		driver.findElement(By.id("login-button")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page:-   "      +    title);
		
		driver.close();
		
		
	}
	

}

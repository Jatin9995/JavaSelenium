package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Session33_TestNGParallelTestingDemo2 {
	
	WebDriver driver;

	@Test
	public void logintitle()  {





		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome2\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("locked_out_user");
		driver.findElement(By.id("login-button")).click();

		//Verify title of the web site

		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		driver.quit();

}
}

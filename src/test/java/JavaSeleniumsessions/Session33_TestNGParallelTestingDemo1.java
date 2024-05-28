package JavaSeleniumsessions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Session33_TestNGParallelTestingDemo1 {

	//Parallel attribute is used for parallel testing.
	//sabhi test cases jisne @Test annotation hai unme parallel attribute use kar s akte hai.
	//Java clas k andar sabhi test cases pe parallel attribute ho sakta hai.
	//all the test cases inside <test> tag of testing xml file will run parallel.
	//Parallel attribute will use with the suit file line.
	//thread-count in parallel attribute will be given by us as per the number of test methods.
	//we can also run 2 classess parallelly by the same way
	
	
	WebDriver driver;

	@Test
	public void verifyTitle()  {





		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");

		//Verify title of the web site
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		driver.quit();



	}


	@Test
	public void Verifylogo()  {

		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome2\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");

		//Verify logo of the web site

		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));

		Assert.assertTrue(logo.isDisplayed());
		driver.quit();

	}



}
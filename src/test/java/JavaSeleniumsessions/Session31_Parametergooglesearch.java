package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Session31_Parametergooglesearch {
	
	//keyword-1)Selenium
    //2)Java
	
	//Launch the browser and open the google.com
	//Add the first keyword as input in the search box.
	//Verify the input value on UI to be same as from test data.
	//Repeat the above two steps for the other 2 keywords. 

	@Test
	@Parameters({"keyword1"})
	public void Googlesearch(String searchdata) {
		
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(searchdata);
		
		Assert.assertEquals(searchbox.getAttribute("value"), searchdata);
		driver.quit();
		
		
		
	}

}

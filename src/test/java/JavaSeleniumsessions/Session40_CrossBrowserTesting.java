package JavaSeleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Session40_CrossBrowserTesting {
	
	WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser) { // we will parameterised the browser here.
		
		
		switch(browser.toLowerCase()) {
		case "chrome":
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		break;
		
		case "msedge":
			System.setProperty("webdriver.edge.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\msedgedriver.exe");
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
		
			break;
		
	}
	}
	
	@Test
	public void LaunchGoogle() {
		
		driver.navigate().to("https://www.google.com/");
		String expectedTitleString="Google";
		String actualString=driver.getTitle();
		Assert.assertEquals(actualString, expectedTitleString);
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
	
	

}

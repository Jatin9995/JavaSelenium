package Session39_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CallwithoutPOM {
	
	@Test
	
public void LoginPage() {
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		
		WithoutPOM WPOM=new WithoutPOM(driver);
		WPOM.enterUID();
		WPOM.enterPWD();
		WPOM.clickBtn();
		
		
	}
	

}

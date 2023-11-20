package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class myAssert {
	
WebDriver driver;
	
	@BeforeMethod

	public void VerifyApp() {
		
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.saucedemo.com/");

	}


	@AfterMethod
	public void CloseBrowser() {
	driver.close();
	}

	@Test//hardassert
	public void Verifytitle() {
		String title="saucedem";
		Assert.assertEquals(driver.getTitle(), title);
		System.out.println(driver.getTitle());
		
	}

	@Test   //hardassert
	public void Verifyurl() {
		String url="https://www.sauce.com/";
		Assert.assertEquals(driver.getCurrentUrl(), url);
		System.out.println(driver.getCurrentUrl());
		
	}

	@Test //softassert
	public void login() {
		SoftAssert soft=new SoftAssert();
		WebElement uid=driver.findElement(By.id("user-name"));
		uid.sendKeys("standard_user");
	soft.assertTrue(uid.isEnabled());
	soft.assertEquals(uid.isDisplayed(), true);

	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	soft.assertAll();



		
		
	}

}

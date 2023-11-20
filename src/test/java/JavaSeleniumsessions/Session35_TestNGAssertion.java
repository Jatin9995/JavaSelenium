package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Session35_TestNGAssertion {
	
//Assertion in testng are used for validating the test 	methods and to verify that the expected result matches with the actual result or not.

	//2types of assertion 1) Hard assert
	      //              2) Soft assert       
//Hardassert me test methods fail hone pe AssertException throw karta hai or further test methods ka execution stop ho jata hai.
	//AssertEquals, AssertNotEquals, AssertTrue, AssertFalse:- ye sab hard asserts hia.
	
	//SoftAssert:- softassert  exception throw nahi karta and further test methods ko execute hone deta hai. exception last me yhrow karta hai jab saare test methods execute ho jate hai.
	//to use the soft assert, u have to use testng softasser class. softassert class ka object create karte hai.
	 
	WebDriver driver;
	
	@BeforeMethod

	public void VerifyApp() {
		
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome2\\chromedriver.exe");
		driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.saucedemo.com/");

	}


	@AfterMethod
	public void CloseBrowser() {
	driver.close();
	}
	
	@Test   //hardassert
	public void Verifytitle() {
		String title="Swag Labs";
		Assert.assertEquals(driver.getTitle(), title);
		System.out.println(driver.getTitle());
		
		String url="https://www.saucedemo.com/";
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

package JavaSeleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//Abstract :-Details hiding or implementation hiding. Data abstraction deals with exposing the interface to the
	//user and hiding the details of implementations.
//a method without body(no implementation) is known as abstract method.Writing abstract in class is mendatory to make class abstract.
	//if a regular class extends an abstract class, then the class must have to implement all the abstract methods of abstract parent class.
	//vehicle, car, scotter example. if car and scooter. abstract class objct cannot be creted. if one class extends the  property of the another class
	//and make the same methods then it is called methodoverriding.
	//interface is a blueprint of the class. it specify what a class must do.
	//Interface is just like abstraction and to inherit its properties implements keyword is used like extend.
//===========================================================================================================	
//Listners:- based on the result of the test cases if we want to take some action then we use testNG listners.
	//post result it is performed.Listerers is an interface in which we have set of abstract methods.we have to integrate the class and interface to perform the listners.
//ITestLister is popularly used.

@Listeners(JavaSeleniumsessions.Session34Listnerclass.class)// it is used to integrate  Session34Listnerclass & Session34Listners

public class Session34Listners {
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Verify title
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		System.out.println("Login is pass");
		
		driver.close();
	
	}


	@Test
	public void Test_Fail() {   //we want to fail the test case to know how Listeres detect it
		
		System.out.println("Falied test case");
	Assert.assertTrue(false);	
		}

	@Test
	public void Test_Skipped() {   //we want to skipped the test to know how Listners detect it
		
		System.out.println("Skipped test case");
		throw new SkipException("Skip exception thrown");
		
		  
	}


	
	
	
}

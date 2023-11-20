package Session39_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithoutPOM {
	
	WebDriver driver;
	//Page object model(POM) is a design pattern, popularly used in automation testing that creates  object repository for web UI elements.
	//Under POM:- 1.Each webpage is a application
	//There is a separate class for each webpage to identy web elements of that webpage and methods which perform operations on those web elements.
	//We use @findBy annotations to create a web element inside page  object model.
	  
	By uid=By.id("user-name");  //it is also a way to locate web elements
	By pwd=By.name("password");
	By clkbtn=By.name("login-button");



//Now we will use the constructor so that we can call the initilize the driver and call the methods.
//constructor will be always in the name of the class.

public WithoutPOM(WebDriver driver) {
	
	this.driver=driver;  // when we will us this then it will initialize the driver.	
	
	} 

//now we will create the methods so that we can call them from another class
public void enterUID() {
	
	driver.findElement(uid).sendKeys("standard_user");
	
	
}

public void enterPWD() {
	
	driver.findElement(pwd).sendKeys("secret_sauce");
	
	
}

public void clickBtn() {
	
	driver.findElement(clkbtn).click();
}



}
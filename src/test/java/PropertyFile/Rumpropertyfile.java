package PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rumpropertyfile {

	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream fileInputStream=new FileInputStream("J:\\eclipse_Jdrive\\JavaSelenium\\src\\test\\java\\PropertyFile\\file.properties");
		//fileinpur stream humne property file ki location dene k liye kiya hai.
		
		Properties prop=new Properties();  //humne yaha pe property fies class ka object banaya hai taaki property file ko access kar paye.
		prop.load(fileInputStream);//it is used to attach the location of the property file with object of properties.
		
	System.setProperty(prop.getProperty("Driver"), prop.getProperty("DriverPath"));  
	//prop.property class is used here to get property of the key from property file.
	//jo bhi key property file me diya hua hai uski value ko access karne k liye prop.property key ka use karna hoga.
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(prop.getProperty("AppUrl"));
	driver.findElement(By.id(prop.getProperty("Uidlocatorbyid"))).sendKeys(prop.getProperty("Username"));
	driver.findElement(By.name(prop.getProperty("Pwdlocatorbyname"))).sendKeys(prop.getProperty("Password"));
	driver.findElement(By.id(prop.getProperty("Clicklocatiorbyid"))).click();
	String expectedtitle = prop.getProperty("AppTitle");
	
	//Assert.assertEquals(expectedtitle, driver.getTitle());
//System.out.println("Title is verified");

if(expectedtitle.equals(driver.getTitle())) {
	
	System.out.println("verified through if conditions");
}
	
	else{
		System.out.println("Title not verified through if condiion");
	}

	
	driver.close();
	
		

		
		
	}

}

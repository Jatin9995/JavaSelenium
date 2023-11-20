package Session39_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WithPOM {
	
	WebDriver driver;

	//With @findby we use pagefactory class with constructor
	//pagefactory.initelements() :- this initelements menthod will create all webelements
	
	@FindBy(name="user-name")  //use in POM to locate the element.1st way of POM	
	WebElement uid;
	
	
	@FindBy(name = "password")
	WebElement pwd;
	
	@FindBy(name = "login-button")
	WebElement clickbtn;
	
	public WithPOM(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUID() {

	uid.sendKeys("standard_user");
		
	} 
	
	public void enterPWD() {
		
		pwd.sendKeys("secret_sauce");
	}

public void clickBTN() {
	clickbtn.click();
}

}

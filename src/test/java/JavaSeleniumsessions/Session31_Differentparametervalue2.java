package JavaSeleniumsessions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Session31_Differentparametervalue2 {
	
	@Test
	@Parameters({"SoftwarecompanyName"})
	//@Parameters("SoftwarecompanyName")
	public void Softwareclass(String Softwarename) {
		
		System.out.println(Softwarename);
	
}

}

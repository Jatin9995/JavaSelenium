package JavaSeleniumsessions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Session31TestNGParametersPracticalDemonstration {
	
	//TestNG parameters are the arguments that we pass to the test methods.there are two ways through which we can pass
		//the parameters to the test methods.
		//1.Test NG parameter(with XML file)  2. Test NG DataProviders
		
		//syntax:-@Parameter({"Parameter name"})
		//syntax:- @Parameter ({"patam1","patam2","patam3"})
	

	@Test
@Parameters({"i","j"})  //We have defined the parameter "i" & "j", so the value of "i" will be the value of a & the value of "j"
	//will be the value of b. We will assign the value to "i" and "j" in xml file only using @Parameters. 
	//if we assign value before the <test tag then all "i" & "j" will be same for every parameter. and if we assign the value after <test
	//then all "i" & "j" value will be different for every parameter. We are converting it into XML file for setting value of i and j.
	
	public void Addition(int a ,int b) {
		System.out.println("Addition:-"+(a+b));
	}

	
	
	@Test
	@Parameters({"i","j"})
	public void Substraction(int a ,int b) {
		System.out.println("Substraction:-"+(a-b));
	}
	
	
	@Test
	@Parameters({"i","j"})
	public void Multiplication(int a ,int b) {
		System.out.println("Multiplication:-"+(a*b));
	}
	
	
	
}

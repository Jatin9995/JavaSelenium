package JavaSeleniumsessions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Session31_Differentparametervalue {
	
	@Test
	@Parameters({"Automobilename"})
	//@Parameters("Automobilename")

	public void Automobileclass(String Carname) {
		
		System.out.println(Carname);
		
	}

}

package Session36BatchTesting;

import org.testng.annotations.Test;

public class HomeScreen {

	//Running multiple test cases in a suit is called batch testing.
	//A test suit is a collection of test cases. test suits help is grouping test cases. You can categorized test suits
	//bases on functionality, module, environment,or something else. in testNG we can use XML file to perform batch testing.

	//test scenario:- sanity test(Suit):- (Class)Homescreen   *launch application()
	//                                                         *verify title()
	//                                                         *Verify logo()

	@Test
	public void LaunchApplication() {

		System.out.println("Application launched passed");

	}

	@Test
	public void VerifyTitle() {

		System.out.println("VerifyTitle passed");

	}

	@Test
	public void VerifyLogo() {

		System.out.println("VerifyLogo passed");

	}


}

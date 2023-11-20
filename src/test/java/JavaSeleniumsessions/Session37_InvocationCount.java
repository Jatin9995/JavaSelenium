package JavaSeleniumsessions;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Session37_InvocationCount {
	
	
	//in TestNG, invocationcount attribute is used to run a single test case multiple times.
	//syntax  @Test(invocationCount=num) where num means no. of time you want to run the test case.
	//ITestContext Context parameter is used to know which test method is currently executing.
	
	
	@Test(invocationCount = 5)
	public void Testmethod1(ITestContext context) {
		
		int currentinvocation=context.getAllTestMethods()[0].getCurrentInvocationCount();  //getAllTestMethods()[0].getCurrentInvocationCount() it is used to know the current method which is executing
		System.out.println("Executing "  +  currentinvocation);
		
		System.out.println("Test method 1...........");
	}

	
	@Test(invocationCount = 3)
	public void Testmethod2(ITestContext context) {
		int currentinvocation=context.getAllTestMethods()[0].getCurrentInvocationCount();  //getAllTestMethods()[0].getCurrentInvocationCount() it is used to know the current method which is executing
		System.out.println("Executing "  +  currentinvocation);
		System.out.println("Test method 2...........");
	}
	
}

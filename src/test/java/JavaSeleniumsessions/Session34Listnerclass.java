package JavaSeleniumsessions;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//we have use the ItestListner interface so that we can take the action post result.
//Based on result if we want to take any action then we use ItestListner
//Listner is a interface in which we have abstract methods. there are several listerers but most popularly used listerner is ITestListers
 


public class Session34Listnerclass implements ITestListener{

	
	@Override
	public void onStart(ITestContext context) {  //this method will invoke before the start of all test methods of Session34Listners class 
	
		System.out.println("On Start method invoked....");
		
	}

	@Override
	public void onFinish(ITestContext context) { //this method will invoke when all the test methods of Session34Listners class finish
	
		System.out.println("On Finished method invoked....");

		
	}
	
	
	@Override
	public void onTestStart(ITestResult result) {//this will invoked when any test methods of Session34Listners class starts.
		
		
		System.out.println("Name of the test method Started...."+ result.getMethod().getMethodName());

 
	}

	@Override
	public void onTestSuccess(ITestResult result) { //this will invoked when any test methods of Session34Listners class Pass.
		System.out.println("Name of the test method Success...."+ result.getMethod().getMethodName());

		
	}

	@Override
	public void onTestFailure(ITestResult result) {  //when any test case of Session34Listners class is failed then this method invoke
		
		System.out.println("Name of the test method failed...."+ result.getMethod().getMethodName());
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Name of the test method Skipped...."+ result.getMethod().getMethodName());

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	
	
	
	
	
	
	

}

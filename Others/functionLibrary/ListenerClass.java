package utilities.functionLibrary;

//import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerClass extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult tr) {
		log("--------------Test Started--------------");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {

		log("Test Name : '" + tr.getName() + "' - PASSED");

		// This will print the class name in which the method is present
		log("Test Class : " + tr.getTestClass());
		
		// This will print the method name
		log("Test Method : " + tr.getMethod());

		// This will print the priority of the method.
		// If the priority is not defined it will print the default priority as 'o'
		log("Test Priority : " + tr.getMethod().getPriority());

		System.out.println("-----------------------------------------");
	}

	@Override
	public void onTestFailure(ITestResult tr) {

		log("Test Name : '" + tr.getName() + "' - FAILED");

		// This will print the class name in which the method is present
		log("Test Class : " + tr.getTestClass());
		
		// This will print the method name
		log("Test Method : " + tr.getMethod());

		// This will print the priority of the method.
		// If the priority is not defined it will print the default priority as 'o'
		log("Test Priority : " + tr.getMethod().getPriority());

		System.out.println("-----------------------------------------");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		log("Test Name : '" + tr.getName() + "' - SKIPPED");

		// This will print the class name in which the method is present
		log("Test Class : " + tr.getTestClass());
		
		// This will print the method name
		log("Test Method : " + tr.getMethod());

		// This will print the priority of the method.
		// If the priority is not defined it will print the default priority as 'o'
		log("Test Priority : " + tr.getMethod().getPriority());

		System.out.println("-----------------------------------------");
	}

	private void log(String methodName) {
		System.out.println(methodName);
	}

	//private void log(IClass testClass) {
	//	System.out.println(testClass.getClass());
	//}

}
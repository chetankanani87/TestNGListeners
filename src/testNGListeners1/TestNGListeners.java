package testNGListeners1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase started and TestCase details are: " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase success and TestCase details are: " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase failed and TestCase details are: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase skipped and TestCase details are: " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}

package Fourstay;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.base;

public class listeners implements ITestListener{
	
	base b = new base();
	
	public void onTestStart(ITestResult res) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult res) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult res) {
		
		try {
			b.getScreenshot(res.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult res) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult res) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}

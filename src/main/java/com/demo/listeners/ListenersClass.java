package com.demo.listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.demo.reports.ExtentLogger;
import com.demo.reports.ExtentReport;

public class ListenersClass implements ISuiteListener,ITestListener {
	public void onStart(ISuite suite) {
		try {
			ExtentReport.initReports();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onFinish(ISuite suite) {
		ExtentReport.flushReports();
	}
	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getDescription());
		ExtentReport.addGroups(result.getMethod().getGroups());
	}

	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass("["+result.getMethod().getMethodName()+"]"+" is passed");
	}

	public void onTestFailure(ITestResult result) {
		ExtentLogger.fail("["+result.getMethod().getMethodName()+"]"+" is Failed",true,result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip("["+result.getMethod().getMethodName()+"]"+" is Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
	}

	

}

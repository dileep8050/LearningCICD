package com.demo.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
	private ExtentManager() {}
	
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();

	static void setExtentTest(ExtentTest extentRef) {
		extentTest.set(extentRef);
	}
	static ExtentTest getExtentTest() {
		return extentTest.get();
	}
	static void unload() {
		extentTest.remove();
	}
}

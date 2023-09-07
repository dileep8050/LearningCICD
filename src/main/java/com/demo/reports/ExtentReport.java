package com.demo.reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.demo.constants.FrameworkConstants;

public final class ExtentReport {
	private ExtentReport() {}
	private static ExtentReports extent;

	
	public static void initReports() throws IOException {
		extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter(FrameworkConstants.getExtentReportPath());
		spark.loadXMLConfig("extentConfig.xml");
		extent.attachReporter(spark);
	}
	
	public static void flushReports() {
		extent.flush();
	}
	
	public static void createTest(String message) {
		ExtentManager.setExtentTest(extent.createTest(message));
	}
	
	public static void addGroups(String[] groups) {
		for(String temp:groups) {
			ExtentManager.getExtentTest().assignCategory(temp);
		}
	}
}

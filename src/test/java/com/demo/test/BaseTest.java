package com.demo.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demo.driver.Driver;

public class BaseTest {
	
	protected BaseTest() {}
	

	@BeforeMethod
	public void setUp() throws Exception {
		Driver.initDriver();
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}
}

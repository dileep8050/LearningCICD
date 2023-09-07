package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.demo.driver.DriverManager;

public final class LoginTest extends BaseTest {
	private LoginTest() {}

	@Test
	public void test1() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Learning Automation",Keys.ENTER);
		System.out.println("test1");
	}
}

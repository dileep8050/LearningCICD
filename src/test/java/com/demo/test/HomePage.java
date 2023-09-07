package com.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.demo.driver.DriverManager;

public final class HomePage extends BaseTest {
	private HomePage(){}
		
	@Test
	public void test3() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("I am test case 3",Keys.ENTER);
		System.out.println("test3");
	}
	
}

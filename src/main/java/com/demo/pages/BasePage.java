package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.driver.DriverManager;
import com.demo.enums.WaitStrategy;
import com.demo.factories.ExplictWaitStrategy;
import com.demo.reports.ExtentLogger;
import com.demo.reports.ExtentManager;
import com.demo.reports.ExtentReport;

public class BasePage {
	
	protected void click(By by,WaitStrategy waitStrategy) {
		WebElement element=ExplictWaitStrategy.performWait(by, waitStrategy);
		element.click();
		ExtentLogger.info("Clicked successfully");
	}
	
	protected void sendKeys(By by,String value,WaitStrategy waitStrategy) {
		WebElement element=ExplictWaitStrategy.performWait(by, waitStrategy);
		element.sendKeys(value);
		ExtentLogger.info(value+ " is passed into the input filed successfully");
	}
	
	protected String getTitleOfThePage() {
		return DriverManager.getDriver().getTitle();
	}
}

package com.demo.factories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.constants.FrameworkConstants;
import com.demo.driver.DriverManager;
import com.demo.enums.WaitStrategy;

public class ExplictWaitStrategy {
	
	public static WebElement performWait(By by,WaitStrategy waitStrategy) {
		WebElement element=null;
		if(waitStrategy==WaitStrategy.CLICKABLE) {
			element=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWaitTime()))
				.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitStrategy==WaitStrategy.VISIBLE) {
			element=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWaitTime()))
				.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitStrategy==WaitStrategy.PRESENCE) {
			element=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWaitTime()))
				.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitStrategy==WaitStrategy.NONE) {
			element=DriverManager.getDriver().findElement(by);
		}
		return element;
	} 

}

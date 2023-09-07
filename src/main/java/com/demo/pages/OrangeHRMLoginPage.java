package com.demo.pages;

import org.openqa.selenium.By;

import com.demo.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {

	private By textboxUsername = By.xpath("//input[@name='username']");
	private By textboxPassword = By.xpath("//input[@name='password']");
	private By buttonLogin = By.cssSelector(".orangehrm-login-button");

	public OrangeHRMLoginPage enterUsername(String username) {
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHRMHomePage clickLoginButton() {
		click(buttonLogin, WaitStrategy.CLICKABLE);
		return new OrangeHRMHomePage();
	}

	public String getTitle() {
		return getTitleOfThePage();
	}
}

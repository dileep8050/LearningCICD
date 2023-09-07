package com.demo.pages;

import org.openqa.selenium.By;

import com.demo.enums.WaitStrategy;

public class OrangeHRMHomePage extends BasePage {
	
	private By linkMenu=By.cssSelector(".oxd-userdropdown-icon");
	private By linkLogout=By.linkText("Logout");
	
	public OrangeHRMHomePage clickMenu() {
		click(linkMenu,WaitStrategy.CLICKABLE);
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		click(linkLogout,WaitStrategy.CLICKABLE);
		return new OrangeHRMLoginPage();
	}

}

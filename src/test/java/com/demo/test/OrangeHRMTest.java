package com.demo.test;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.pages.OrangeHRMLoginPage;

public final class OrangeHRMTest extends BaseTest{
	
	private OrangeHRMTest() {}
	
	@Test(dataProvider = "getData",groups={"smoke","sanity"})
	public void loginLogouttest(String username,String password) {
		
		String title=new OrangeHRMLoginPage()
				.enterUsername(username).enterPassword(password).clickLoginButton()
				.clickMenu().clickLogout()
				.getTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");	
	}
	
	@Test(groups={"sanity"})
	public void newTest() {
		
		String title=new OrangeHRMLoginPage()
				.enterUsername("Admin").enterPassword("admin123").clickLoginButton()
				.clickMenu().clickLogout()
				.getTitle();
		
		Assertions.assertThat(title)
		.isEqualTo("OrangeHRM");	
	}
	
	@DataProvider(parallel=true)
	public Object[][] getData() {
		return new Object[][] {
			{"Admin","admin123"}
		//	{"admin","test"}
			//{"Admin","admin123"}
		};
	}
}

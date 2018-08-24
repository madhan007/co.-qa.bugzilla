package com.bugzilla.testcases;

import org.testng.annotations.Test;

import helpers.BaseClass;
import helpers.ButtonHelper;
import helpers.LinkHelper;
import helpers.ScreenShotHelper;
import helpers.TextBoxHelper;

public class LoginTest extends BaseClass {
	


	

	@Test(enabled=true)
	
	public void loginTest() {
		
		LinkHelper.clickOnLink("enter_bug");
		TextBoxHelper.typeInTextBox("Bugzilla_login", "madhan@bugzilla.com");
		TextBoxHelper.typeInTextBox("Bugzilla_password", "madhan143");
		ButtonHelper.clickButton("log_in");
		ScreenShotHelper.takeSnapShot(this.getClass().toString());
		
		System.err.println("Error Message");
		
		

	}
	
	

}

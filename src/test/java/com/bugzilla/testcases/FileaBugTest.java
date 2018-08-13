package com.bugzilla.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import helpers.BaseClass;
import helpers.ButtonHelper;
import helpers.DropdownHelper;
import helpers.LinkHelper;
import helpers.ScreenShotHelper;
import helpers.TextBoxHelper;

public class FileaBugTest extends BaseClass {

	@Test(enabled= true)
	public void FileaBugPage() {
		
		LinkHelper.clickOnLink("enter_bug");
		TextBoxHelper.typeInTextBox("Bugzilla_login", "madhan@bugzilla.com");
		TextBoxHelper.typeInTextBox("Bugzilla_password", "madhan143");
		ButtonHelper.clickButton("log_in");
		try {
			Assert.assertEquals(driver.getTitle(), "Enter Bug: TestProduct");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Title assertion failed");
		}
		DropdownHelper.selectByValue("bug_severity","minor");
		DropdownHelper.selectByVisibleText("rep_platform", "Macintosh");
		TextBoxHelper.typeInTextBox("comment", "Testing the comment section");
		ButtonHelper.clickSubmitButton("commit");
		ScreenShotHelper.takeSnapShot("summaty_ErrorMsg");
		
		
	}
	
	
	
}

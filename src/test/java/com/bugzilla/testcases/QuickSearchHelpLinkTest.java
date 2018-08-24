package com.bugzilla.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import helpers.BaseClass;
import helpers.ButtonHelper;
import helpers.DropdownHelper;
import helpers.LinkHelper;
import helpers.ScreenShotHelper;
import helpers.TextBoxHelper;

public class QuickSearchHelpLinkTest extends BaseClass {
	
	
	@Test(enabled=true)
	public void qshLink() {
	
		TextBoxHelper.typeInTextBox("quicksearch_main", "File a bug");
		ButtonHelper.clickButton("find");
		System.out.println(driver.getTitle());
		LinkHelper.clickOnLink("/html[1]/body[1]/div[2]/ul[2]/li[1]/a[1]");
		System.out.println(driver.getTitle());
		TextBoxHelper.typeInTextBox("Bugzilla_login", "madhan@bugzilla.com");
		TextBoxHelper.typeInTextBox("Bugzilla_password", "madhan143");
		ButtonHelper.clickButton("log_in");
/*		try {
			Assert.assertEquals(driver.getTitle(), "Enter Bug");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Title assertion failed");
		}*/
		LinkHelper.clickOnLink("TestNG");
		DropdownHelper.selectByVisibleText("bug_severity","minor");
		DropdownHelper.selectByVisibleText("rep_platform", "Macintosh");
		TextBoxHelper.typeInTextBox("comment", "Testing the comment section");
		ButtonHelper.clickSubmitButton("commit");
		ScreenShotHelper.takeSnapShot("summaty_ErrorMsg");
		
		
		
	}

}

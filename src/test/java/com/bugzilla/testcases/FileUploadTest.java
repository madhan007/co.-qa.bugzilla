package com.bugzilla.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import helpers.BaseClass;
import helpers.ButtonHelper;
import helpers.DropdownHelper;
import helpers.LinkHelper;
import helpers.ScreenShotHelper;
import helpers.TextBoxHelper;

public class FileUploadTest extends  BaseClass {

	@Test
	public void fileUpLoad() throws Exception {

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
		DropdownHelper.selectByValue("bug_severity", "minor");
		DropdownHelper.selectByVisibleText("rep_platform", "Macintosh");
		//TextBoxHelper.typeInTextBox("comment", "Testing the comment section");
		//ButtonHelper.clickButton("//input[@value='Add an attachment']");
		Pattern attach=new Pattern ("C:\\Users\\TatTvamAsi\\Documents\\attach.PNG");
	    Pattern choosefile = new Pattern("C:\\Users\\TatTvamAsi\\Documents\\Browse.PNG");
		Pattern filename = new Pattern("C:\\Users\\TatTvamAsi\\Documents\\filename.PNG");
		Pattern open = new Pattern("C:\\Users\\TatTvamAsi\\Documents\\open.PNG");

		Screen scr = new Screen();
		scr.setAutoWaitTimeout(5);
		scr.click(attach);
		scr.click(choosefile);
		Thread.sleep(2000);
		scr.type(filename, "C:\\Users\\TatTvamAsi\\Documents\\fileupload.txt");
		scr.click(open);
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("description")));
		TextBoxHelper.typeInTextBox("description", "description filled");
		ScreenShotHelper.takeSnapShot("fileupload");
		ButtonHelper.clickButton("commit");
		ScreenShotHelper.takeSnapShot("aftersubmitbug");

	}
}
package helpers;

import org.openqa.selenium.support.ui.Select;

public class DropdownHelper extends BaseClass {
	
	private static Select sel;

	public static void selectByIndex(String locator, int index) {
		
		sel=new Select(getElement(locator));
		sel.selectByIndex(index);

	}

	public static void selectByValue(String locator, String value) {
		sel=new Select(getElement(locator));
		sel.selectByValue(value);

	}

	public static void selectByVisibleText(String locator, String text) {
		sel=new Select(getElement(locator));
		sel.selectByVisibleText(text);

	}

}

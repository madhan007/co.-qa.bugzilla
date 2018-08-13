package helpers;

import org.openqa.selenium.WebElement;

public class CheckBoxHelper extends BaseClass {

	public static void clickCheckBox(String locator) {

		WebElement ele = getElement(locator);
		ele.click();

	}

	public static boolean isChecked(String locator) {
		WebElement ele = getElement(locator);
		return ele.isSelected();
	}

}

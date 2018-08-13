package helpers;

import org.openqa.selenium.WebElement;

public class LinkHelper extends BaseClass {

	public static void clickOnLink(String locator) {

		WebElement ele = getElement(locator);
		ele.click();

	}

}

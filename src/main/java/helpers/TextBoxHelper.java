package helpers;

import org.openqa.selenium.WebElement;

public class TextBoxHelper extends BaseClass {
	
	
	public static void typeInTextBox(String locator, String Value) {
		
		WebElement ele= getElement (locator);
		ele.clear();
		ele.sendKeys(Value);
		
	}

}

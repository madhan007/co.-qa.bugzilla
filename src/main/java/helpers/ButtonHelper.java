package helpers;

import org.openqa.selenium.WebElement;

public class ButtonHelper extends BaseClass {
	
	
	public static void clickButton(String locator) {
		WebElement ele = getElement(locator);
		ele.click();
	}
	
     public static void clickSubmitButton(String locator) {
    	 
    	 WebElement ele = getElement(locator);
    	 ele.submit();
	}

}

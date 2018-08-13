package helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotHelper extends BaseClass {
	
	
	
	public static void takeSnapShot(String fileName) {
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(source, new File("./ScreenShots/"+fileName+".PNG"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

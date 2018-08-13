package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {

	protected static WebDriver driver = null;

	@Parameters("Browser")
	@BeforeMethod

	public static void startUp(String Browser) {

		if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/java/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/java/resources/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.err.println("Browser not assigned");
		}

		driver.get("http://localhost:5001/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public static WebElement getElement(String locator) {
		if (driver.findElements(By.id(locator)).size() == 1) {
			return (driver.findElement(By.id(locator)));

		} else if (driver.findElements(By.linkText(locator)).size() == 1) {
			return (driver.findElement(By.linkText(locator)));
		} else if (driver.findElements(By.name(locator)).size() == 1) {
			return (driver.findElement(By.name(locator)));
		} else if (driver.findElements(By.xpath(locator)).size() == 1) {
			return (driver.findElement(By.xpath(locator)));
		} else if (driver.findElements(By.cssSelector(locator)).size() == 1) {
			return (driver.findElement(By.cssSelector(locator)));
		} else if (driver.findElements(By.partialLinkText(locator)).size() == 1)

		{
			return (driver.findElement(By.partialLinkText(locator)));
		} else if (driver.findElements(By.tagName(locator)).size() == 1) {
			return (driver.findElement(By.tagName(locator)));
		} else {
			throw new NoSuchElementException("No Such Element:   " + locator);
		}
	}

	@AfterMethod

	public static void tearDown() {
		driver.close();
	}

}

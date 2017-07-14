package pageobjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import helpers.Log;

import java.util.ArrayList;


/**
 * Created by July on 7/7/17.
 */
public abstract class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;

	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}

	// isElemnent Present
	public static boolean isElementPresent(WebElement element){
		try{
			element.isDisplayed();
			return true;
		}catch (NoSuchElementException e) {
			return false;
		}
	}

	// switch tab
	public static void switchChromeTab() throws InterruptedException{
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		Log.Log.info("Switch to the new tab");

	}

}

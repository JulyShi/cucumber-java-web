package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static pageobjects.BaseClass.screenshot;


/**
 * Created by July on 7/7/17.
 */
public class Hooks{
    public static WebDriver driver;

    public static String browser = "chrome";
    //public static String URL = "http://www.baidu.com";
    public static String URL2 = "https://www.qunar.com/";

    public static Logger logger = Logger.getLogger("console");

    @Before
    /**
     * Open browser
     */
    public void openBrowser() throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            // open chrome browser
            System.out.println("start chrome browser...");
            System.setProperty("webdriver.chrome.driver","./chromedriver"); //Set chromedriver path
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.get(URL2);
            screenshot(driver); // First snapshot
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            screenshot(driver); // Second snapshot
            logger.info("This is info message: Open broswer successfully");
        }

        else if(browser.equalsIgnoreCase("firefox")){
            // open chrome browser

            System.out.println(" start FireFox driver");
            System.setProperty("webdriver.firefox.bin", "/Applications/Firefox.app/Contents/MacOS/firefox-bin");
            WebDriver driver = new FirefoxDriver();
            //driver = new FirefoxDriver();
            driver.get(URL2);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        else if(browser.equalsIgnoreCase("ie")){

            System.setProperty("webdriver.ie.driver", "files/IEDriverServer64.exe"); //Set IEDriver 路径
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); //IE默认启动保护模式，要么手动在浏览器的设置中关闭保护模式，要么在代码中加上这一句
            capabilities.setCapability("ignoreProtectedModeSettings",true);
            driver = new InternetExplorerDriver(capabilities);
        }

        else
        {
            throw new IllegalArgumentException("The Browser Type is Undefined");
        }

    }


    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
       
        if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
             byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshot, "./target/screenshots/image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        //driver.quit();
        
    }


}

package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static WebDriver driver;
    private static final String WEBDRIWER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String CHROME_DRIVER_EXE_PATH = "C:/webDrivers/chromedriver_win32/chromedriver.exe";

    private DriverSingleton (){};

    public static WebDriver getDriver(){
        if (null == driver){
            System.setProperty(WEBDRIWER_CHROME_DRIVER, CHROME_DRIVER_EXE_PATH);
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}

package config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import commons.Commons;
import commons.Windows;

public class DriverSettings extends Commons {
    /** Run browser */
    public static void openBrowser() throws Exception {
	try {
	    if (JsonData.Browser.contains("Firefox")) {
	    
	    System.setProperty("webdriver.gecko.driver", "Z:\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Windows.mainWindow = driver.getWindowHandle();
	    } else if (JsonData.Browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Z:\\Drivers/chromedriver.exe");
	//		driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--enable-automation");
			options.addArguments("disable-infobars");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-print-preview");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			// capability.setCapability(ChromeOptions.CAPABILITY, options);
			// capability.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Windows.mainWindow = driver.getWindowHandle();
			driver.manage().window().maximize();
	    // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

    public static void killBrowser() throws IOException {
	if (JsonData.Browser.contains("Firefox")) {
	    String stop = "taskkill /im firefox.exe /f";
	    Runtime.getRuntime().exec(stop);
	}
    }

    public static void closeBrowser() {
	driver.close();
    }

    public static void quitBrowser() {
	driver.quit();
    }
}
